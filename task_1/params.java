package task_1;
import java.util.LinkedHashMap;
import java.util.Map;

public class params {

    public Map<String, String> Params() {

        Map<String, String> requestParamss = new LinkedHashMap<>();
        requestParamss.put("name", "Ivanov");
        requestParamss.put("country", "Ukraine");
        requestParamss.put("city", "Kiev");
        requestParamss.put("age", null);
        requestParamss.put("name1","Ivanov");
        requestParamss.put("name2", "Ivanov");

        return requestParamss;
}
}
