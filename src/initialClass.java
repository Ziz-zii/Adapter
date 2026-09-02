public class initialClass implements initialInterface {

    @Override
    public void read(String fileType) {
        if (fileType.equalsIgnoreCase("txt"))
        {
            System.out.println("Чтение файла (txt)" + fileType);
        }
        else
        {
            System.out.println("Ошибка чтения (неизвесный формат)" + fileType);
        }
    }
}
