package task_1;

import java.util.Map;

public class stringBuilder1 {

    params pa = new params();

    public String StringBuilder1(String startRequest) {

        Map<String, String> requestParams = pa.Params();

        StringBuilder sb = new StringBuilder();
        sb.append(startRequest);

        for (Map.Entry<String, String> entry : requestParams.entrySet())
        {
            if (entry.getKey() == null || entry.getValue() == null)
                continue;

            sb.append(entry.getKey() + " = " + '"' + entry.getValue() + '"' + " and ");           
        }
        if (sb.length() > 5)
        sb.delete(sb.length() - 5, sb.length());
        sb.append(";");

        return sb.toString();
    }
}
