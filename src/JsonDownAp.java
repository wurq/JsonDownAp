import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiClass;

/**
 * Created by wurongqiu on 16-6-1.
 */
public class JsonDownAp extends AnAction implements JsonIDimp{

    protected PsiClass mClass;
    private Project mProject;

    AnActionEvent mEvent;
    @Override
    public void actionPerformed(AnActionEvent event) {
        // action ref
        InsertJson(event);
    }

    private void InsertJson(AnActionEvent event){
        // excute the  thread to generate the json data &its file
        mEvent = event;
        mProject = mEvent.getData(PlatformDataKeys.PROJECT);

        projectID projectDialog = new projectID(this);
        projectDialog.show();
    }


    @Override
    public void getID(String id) {
        String queryUrl = "http://nei.hz.netease.com/api/projectView/getByProjectId?pid=";//addBlanks(selectedText);

        new Thread(new RequestRunnable(queryUrl,id,mProject)).start();
    }
}
