# Android Studio 插件
这是基于IntelliJ IDEA开发的Android Studio插件项目，功能
   - 这是android studio插件代码,非android代码,运行在IntelliJ环境下，开发语言是java。
   - 通过公司内NEI自动生成代码，命令是nei build 11111 -c   /XXXpath/javatpl/build.json， （11111代指项目ID，请参考http://nei.hz.netease.com/，XXXpath代指项目绝对路径，生产后代码在out_project目录下），详细情况介绍见内网介绍nei_template项目。
   - 自动生成代码的Nodejs开源项目地址是  https://github.com/NEYouFan/nei-toolkit ，有兴趣的童鞋可自行参考。
  - 注意事项1，项目中since-build号，请参考http://www.jetbrains.org/intellij/sdk/docs/basics/getting_started/build_number_ranges.html。
  - 注意事项2，由于Android Studio基于IDEA-135开发，适用Android Studio产检的since-build要符合要求。
  - 注意事项3，开发androidstudio插件详细说明参见 https://g.hz.netease.com/mobile-android/document/blob/master/%E8%B0%83%E7%A0%94%E8%B5%84%E6%96%99/androidstudio%E6%8F%92%E4%BB%B6%E5%BC%80%E5%8F%91%E8%AF%B4%E6%98%8E.md
  - 注意事项4，开发时java版本选择1.6，否则不能在Android Studio开发环境下使用
