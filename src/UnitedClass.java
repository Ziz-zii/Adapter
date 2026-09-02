public class UnitedClass implements initialInterface{
    private initialClass iniClass;
    private adapterClass adpClass;

    public UnitedClass(){
        this.iniClass = new initialClass();
        this.adpClass = new adapterClass();
    }
    @Override
    public void read(String fileType){

        if (fileType.equalsIgnoreCase("txt")) {
            iniClass.read(fileType);
        } else if (fileType.equalsIgnoreCase("docx")) {
            adpClass.read(fileType);
        } else {
            System.out.println("Ошибка чтения (неизвесный формат)" + fileType);
        }
    }

}
