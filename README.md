
# Android Studio 插件使用向导
这是基于IntelliJ IDEA开发的Android Studio插件，使用步骤
   -  在部分无网络环境下，参考 https://g.hz.netease.com/hearttouch-android/nei_httemplate 自动生成代码，其中由于无网络环境（该项目本身当project id为0时也相当于无网络环境）生成的代码无NEI配置数据，可使用本插件在有网络环境时生成。
   -  本地插件安装过程，打开AndroidStudio,打开生成的AndroidStudio项目，之后打开preference，选中左侧的plugins，再选择右侧的install plugin from disk，选择jar或者其他压缩文件（本项目生成的是jar文件），然后安装，安装后在AndroidStudio集成环境下的Edit menu下会多一个选项JsonDataDownApi（其他情况根据插件类型可能会出现在其他菜单项目下），选择该选项即可使用本插件之功能。
   - 自动生成代码的Nodejs开源项目地址是  https://github.com/NEYouFan/nei-toolkit ，有兴趣的童鞋可自行参考。
# 插件开发注意事项
这是基于IntelliJ IDEA开发的Android Studio插件项目，功能
   
  - 注意事项1，项目中since-build号，请参考http://www.jetbrains.org/intellij/sdk/docs/basics/getting_started/build_number_ranges.html。
  - 注意事项2，由于Android Studio基于IDEA-135开发，适用Android Studio常见的since-build要符合要求。
  - 注意事项3，开发InelliJ IDEA插件详细说明参见 https://g.hz.netease.com/mobile-android/document/blob/master/%E8%B0%83%E7%A0%94%E8%B5%84%E6%96%99/androidstudio%E6%8F%92%E4%BB%B6%E5%BC%80%E5%8F%91%E8%AF%B4%E6%98%8E.md
  - 注意事项4，开发时java版本选择1.6，否则不能在Android Studio开发环境下使用
  - 注意事项5，这是android studio插件代码,非android代码,运行在IntelliJ环境下，开发语言是java。
  