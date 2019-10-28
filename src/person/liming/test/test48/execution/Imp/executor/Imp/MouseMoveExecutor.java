package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Imp.auxiliary.Imp.HistogramImagelocator;
import person.liming.test.test48.execution.Imp.auxiliary.Imp.ImageLocatorFactory;
import person.liming.test.test48.execution.Imp.executor.AbstractRobotExecutor;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;
import person.liming.test.test48.execution.Imp.context.MouseMoveContext;
import sun.awt.image.ImageFormatException;

import java.awt.*;
import java.nio.file.NoSuchFileException;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 19:272019/10/23
 */
public class MouseMoveExecutor extends AbstractRobotExecutor {

    @Override
    protected ExecuteResult specificExecute() {
        MouseMoveContext mouseMoveContext = (MouseMoveContext)context;
        superRobot.linerMoveMouse(mouseMoveContext.getX(), mouseMoveContext.getY(), 2);
        return new StringExecuteResult("执行鼠标移动指令成功");
    }

    @Override
    public MouseMoveContext parse(String param) {
        String temp = param.split( " ", 2)[1];
        if(temp.matches("\\d+,\\d+")) {//直接移动到坐标指令
            String[] pos = temp.split(",");
            return new MouseMoveContext(Integer.valueOf(pos[0]), Integer.valueOf(pos[1]));
        }else{//移动到指定图标上的指令
            ImgCurdExecutor imgCurdExecutor = new ImgCurdExecutor();
            imgCurdExecutor.setContext(imgCurdExecutor.parse(temp));
            StringExecuteResult executeResult = (StringExecuteResult)imgCurdExecutor.execute();
            String path = executeResult.toString();
            HistogramImagelocator imagelocator = null;
            try {
                imagelocator = ImageLocatorFactory.getHistogramImageLocator(superRobot.captureAllScreen(), path);
            } catch (NoSuchFileException e) {
                e.printStackTrace();
            } catch (ImageFormatException e) {
                e.printStackTrace();
            }
            Point point = imagelocator.locate();
            return new MouseMoveContext(point.x, point.y);
        }
    }
}
