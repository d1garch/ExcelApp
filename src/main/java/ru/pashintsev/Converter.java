package ru.pashintsev;

public class Converter {

    public static String columnToStringConvert(int[] columnIndexes) {

        String result = "";

        if(columnIndexes.length == 0) {
            result = result + "Не введено ни одного значения\n";
            return result;
        }

        for(int item : columnIndexes) {
            result = result + columnToStringConvertImpl(item);
        }
        return result;
    }
    
    public static String columnToStringConvert(int columnIndex) {
        return columnToStringConvertImpl(columnIndex);
    }
    
    private static String columnToStringConvertImpl(int columnIndex) {
        String result = "";        
        if (item <= 0) {
                result = result + "Индекс меньше или равен нулю. Конвертация не возможна.\n";
                continue;
            }

            String column = "";
            int columnIndex = item;
            columnIndex--;

            do {
                if (column.length() > 0) {
                    columnIndex--;
                }
                column = ((char) (columnIndex % 26 + (int) 'A')) + column;
                columnIndex = (columnIndex - columnIndex % 26) / 26;
            } while (columnIndex > 0);

            result = result + item + ":" + column + "\n";
        }
        return result;
    }
    
    
}
