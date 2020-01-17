package cn.sitedev.adapter.springadapter;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
        // 此处模拟SpringMVC从request取handler对象
        // 适配器可以获取到希望的Controller
        HttpController httpController = new HttpController();
        SimpleController simpleController = new SimpleController();
        AnnotationController annotationController = new AnnotationController();

        // 得到对应的适配器
        HandlerAdapter adapter = getHandler(httpController);
        adapter.handle(httpController);

        adapter = getHandler(simpleController);
        adapter.handle(simpleController);

        adapter = getHandler(annotationController);
        adapter.handle(annotationController);

    }

    public HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter handlerAdapter : handlerAdapters) {
            if (handlerAdapter.supports(controller)) {
                return handlerAdapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }

}
