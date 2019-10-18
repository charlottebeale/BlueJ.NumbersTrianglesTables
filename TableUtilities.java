 

public class TableUtilities {
    public static String getSmallMultiplicationTable(int tableSize) {
        String tableString = "";
       
        for (int i = 1; i <= tableSize; ++i) 
    {
            for (int j = 1; j <= tableSize; ++j)
            {
                tableString += String.format("%3d" , i*j) + " |";
            }
           tableString += "\n";
    }
    return tableString;
}
    public static String getLargeMultiplicationTable(int tableSize) {
        String tableString = "";
       
        for (int i = 1; i <= tableSize; ++i) 
    {
            for (int j = 1; j <= tableSize; ++j)
            {
                tableString += String.format("%3d" , i*j) + " |";
            }
           tableString += "\n";
    }
    return tableString;
    }

    public static String getMultiplicationTable(int tableSize) {
       String tableString = "";
       
        for (int i = 1; i <= tableSize; ++i) 
    {
            for (int j = 1; j <= tableSize; ++j)
            {
                tableString += String.format("%3d" , i*j) + " |";
            }
           tableString += "\n";
    }
    return tableString;
    }
}
