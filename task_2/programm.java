package task_2;

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;


public class programm {

    static int [] СreateMass() {

        Random random = new Random();
        int arr[] = new int[10];
        StringBuilder str = new StringBuilder();

        str.append("Начальный массив: ");

        for ( int i = 0; i < 10; i++ )
        {
            arr[i] = random.nextInt(9);
            str.append( Integer.toString( arr[i] ) );
            str.append(" ");
        }
        System.out.println(str);
        return arr;
    }

    static void SortMass( int[] startMass ) {

        StringBuilder str1 = new StringBuilder();
        str1.append("Отсартированный массив: ");
        for ( int i = 1; i < 10; i++ )
        {
            if ( startMass[i] < startMass[i-1] || startMass[i] == startMass[i-1])
            {
                int q = startMass[i-1];
                startMass[i-1] = startMass[i];
                startMass[i] = q;
            }
           
        }
        for ( int j = 0; j < 10; j++ )
        {
            str1.append( Integer.toString( startMass[j] ) );
            str1.append(" "); 
        }
        System.out.println(str1);
    }

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(programm.class.getName());

        FileHandler fh = new FileHandler("log.txt");

        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.log(Level.WARNING, "Тестовое логирование" );
        logger.info("Тестовое логирование" );
        int arr[] = new int[10];
        arr = СreateMass();
        SortMass(arr);       
    }
}
