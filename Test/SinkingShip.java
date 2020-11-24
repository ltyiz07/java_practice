package Test;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class SinkingShip {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashSet ship = new HashSet();
        try{
            //파일 객체 생성
            File file = new File("D:\\Young\\jump_2\\morning\\example_files\\침몰타이타닉1.txt");
            //입력 스트림 생성
            FileReader fileReader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
                ship.add(line);
            }
            //.readLine()은 끝에 개행문자를 읽지 않는다.
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }

        Iterator it = ship.iterator();
        String firstLine = (it.next()).toString();
        String secondLine = (it.next()).toString();
        String[] second_line = secondLine.split(" ");
        HashSet hashLine = new HashSet();
        Integer[] second_line1 = new Integer[second_line.length];
        for (int i = 0; i < second_line.length; i++) {
            Integer temp = Integer.parseInt(second_line[i]);
            hashLine.add(temp);
        }

        List list = new LinkedList(hashLine);
        Collections.sort(list);
        System.out.println(list);
        it = list.iterator();

        for (int i = 0; i < second_line1.length; i++) {
            second_line1[i] = (Integer)it.next();
        }

        int count = 0;
        while ( second_line1.length > 1 ) {
            // 150  수정할것...
                if (second_line1[0] + second_line1[second_line1.length - 1] > 150) {
                    second_line1 = Arrays.copyOfRange(second_line1, 0, second_line1.length - 1);
                    count += 1;
                } else {
                    second_line1 = Arrays.copyOfRange(second_line1, 1, second_line1.length - 1);
                    count += 1;
                }
        }
        System.out.println(count);


    }

}