# NodeProgress
#带节点的进度条
##自定义view 重写onDraw()方法

关键代码：
1. 在onMeasure()方法计算控件宽度 高度 初始化节点个数
2. 在onDraw()中画内容分三步分
   1. 画线    
   2. 画节点
   3. 画文字

上效果图：
![0](img/0.png =100x100)

