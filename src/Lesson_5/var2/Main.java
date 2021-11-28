package Lesson_5.var2;

import java.io.*;

public class Main {

    public static void main(String[] args){

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 300}, {150, 250, 350}};
        File file = new File("file1.csv");
        AppData appDataSave = new AppData (header, data);
        AppData appDataLoad = new AppData(null, null);
        save(appDataSave, file);
        load(appDataLoad, file);
        System.out.println(appDataLoad);

    }
    //Writer=save
    public static void save(AppData save, File file1){
        StringBuilder header = new StringBuilder();
        String[] tempHeader;
        StringBuilder data;
        int[][] tempData;
        try (PrintWriter out = new PrintWriter(file1)){
            tempHeader = save.getHeader();
            for (String string: tempHeader){
                header.append(string).append(";");
            }
            header = new StringBuilder(header.substring(0, header.length() - 1));
            out.println(header);

            tempData = save.getData();
            for (int[] tempDatum : tempData) {
                data = new StringBuilder();
                for (int j = 0; j < tempData[0].length; j++) {
                    data.append(tempDatum[j]).append(";");
                }
                data = new StringBuilder(data.substring(0, data.length() - 1));
                out.println(data);

            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    // Reader=load
    public static void load(AppData load, File file1) {
        String line;
        String[] stringData;
        String[] header;
        int counter = 0, items;
        int lines = 0;

        try (BufferedReader in = new BufferedReader(new FileReader(file1))) {
            lines = (int) in.lines().count() - 1;
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] data = new int[lines][];

        try (BufferedReader in = new BufferedReader(new FileReader(file1))) {
            header = in.readLine().split(";");

            while ((line = in.readLine()) != null) {
                stringData = line.split(";");
                items = 0;
                data[counter] = new int[stringData.length];
                for (String tempString : stringData) {
                    data[counter][items] = Integer.parseInt(tempString);
                    items++;
                }
                counter++;
            }
            load.setHeader(header);
            load.setData(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
