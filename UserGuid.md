# 插件使用向导
这是基于IntelliJ IDEA开发的Android Studio插件项目，使用步骤
   -  在部分无网络环境下，参考 https://g.hz.netease.com/hearttouch-android/nei_httemplate 自动生成代码，其中由于无网络环境（该项目本身当project id为0时也相当于无网络环境）生成的代码无NEI配置数据，可使用本插件在有网络环境时生成。
   -  本地插件安装过程，打开AndroidStudio,打开生成的AndroidStudio项目，之后打开preference，选中左侧的plugins，再选择右侧的install plugin from disk，选择jar或者其他压缩文件（本项目生成的是jar文件），然后安装，安装后在AndroidStudio集成环境下的Edit menu下会多一个选项JsonDataDownApi（其他情况根据插件类型可能会出现在其他菜单项目下），选择该选项即可使用本插件之功能。
   - 自动生成代码的Nodejs开源项目地址是  https://github.com/NEYouFan/nei-toolkit ，有兴趣的童鞋可自行参考。