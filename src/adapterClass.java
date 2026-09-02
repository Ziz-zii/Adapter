public class adapterClass implements initialInterface{

    private newClass newClass;

    public adapterClass(){
        this.newClass = new newClass();
    }
    @Override
    public void read(String fileType){
        if (fileType.equalsIgnoreCase("docx")){
            newClass.readDocx(fileType);
        }
        else{
            System.out.println("Ошибка чтения (неизвесный формат)"+fileType);
        }
    }
}
