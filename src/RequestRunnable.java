import com.intellij.openapi.project.Project;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by wurongqiu on 16-6-2.
 */
public class RequestRunnable implements Runnable  {
    private String mQueryUrl;
    private String mQueryID;
    private Project mProject;

    public RequestRunnable(String aQueryUrl, String aQueryId,Project aProject) {
        this.mQueryUrl = aQueryUrl;
        this.mQueryID = aQueryId;
        this.mProject = aProject;
    }
    @Override
    public void run() {
        try {
            System.out.println("mQueryID = " + mQueryID);
            URI uri = createTranslationURI();
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000)
                    .setConnectionRequestTimeout(5000).build();
            HttpGet httpGet = new HttpGet(uri);
            httpGet.setConfig(requestConfig);
            HttpClient client = HttpClients.createDefault();
            HttpResponse response = client.execute(httpGet);

            int status = response.getStatusLine().getStatusCode();
//            if (status >= 200 && status < 300)
            {
                HttpEntity resEntity = response.getEntity();
                String json = EntityUtils.toString(resEntity, "UTF-8");
                Fio.writeStringFile(mProject,mQueryID,json);
                System.out.println("json = " + json);
                showPopupBalloon("OK");
            }
//            else
            {
                showPopupBalloon(response.getStatusLine().getReasonPhrase());
            }
        } catch (IOException e) {
            showPopupBalloon(e.getMessage());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /*
     *  create request url
     */
    private URI createTranslationURI() throws URISyntaxException {
        URIBuilder builder = new URIBuilder(mQueryUrl);
        builder.addParameter("pid", mQueryID);

        return builder.build();
    }

    private void showPopupBalloon(final String result) {
    }


}
