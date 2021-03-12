# Flutter Introduction

## 简介
Flutter是谷歌的新移动UI框架，具有表现力强、可与现有代码工作、学习成本不高等优点。Flutter可在Android与ios下快速构建高质量的原生页面，是前端开发者的又一项有力工具。

## 产品特色
<strong>热启动</strong>
Flutter通过有状态的热重载提供了快速的开发周期，该功能可以重载正在运行的应用程序的代码而无需重新启动或丢失应用程序状态。

<strong>声明式UI</strong>
从Win32到网络再到Android和iOS的框架通常使用命令式UI编程。为了减轻开发人员不得不编写如何在各种UI状态之间进行转换的负担，相比之下，Flutter让开发人员描述当前的UI状态并将转换留给框架。

<strong>视图等效</strong>
在Android中，视图是屏幕上显示的所有内容的基础。按钮，工具栏和输入，一切都是视图。窗口小部件无法完全映射到Android视图，但是当您熟悉Flutter的工作原理时，您可以将它们视为“声明和构造UI的方式”。
但是，这些与视图略有不同。首先，小部件的寿命不同：它们是不可变的，并且仅在需要更改之前存在。每当窗口小部件或其状态发生变化时，Flutter的框架都会创建一个新的窗口小部件实例树。相比之下，Android视图仅绘制一次，直到被调用才重绘。Flutter的小部件轻巧，部分是由于它们的不可变性。因为它们不是视图本身，也不是直接绘制任何东西，而是对UI及其语义的描述，这些描述“夸大”了内部的实际视图对象。Flutter包括材料组件库。这些是实现“材料设计”准则的小部件 。但是Flutter具有足够的灵活性和表现力，可以实现任何设计语言。

<strong>更新小部件</strong>
在Android中，您可以通过直接对view进行改变来更新视图。然而，在Flutter中Widget是不可变的，不会直接更新，而必须使用Widget的状态。这是Stateful和Stateless widget的概念的来源。一个Stateless Widget就像它的名字，是一个没有状态信息的widget。当您所需要的用户界面不依赖于对象配置信息以外的其他任何内容时，StatelessWidgets非常有用。

<strong>新的布局</strong>
在Android中，您通过XML编写布局，但在Flutter中，您可以使用widget树来编写布局。

<strong>如何在布局中添加或删除组件</strong>
在Android中，您可以从父级控件调用addChild或removeChild以动态添加或删除View。 在Flutter中，因为widget是不可变的，所以没有addChild。相反，您可以传入一个函数，该函数返回一个widget给父项，并通过布尔值控制该widget的创建。