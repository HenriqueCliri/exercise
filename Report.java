public class Report {
    private String title; //atributo

    public Report(String title){
        this.title = title;
    }

    public class Item { //classe interna, pode acessar diretamente title (atributo)
        public void show() {
            System.out.println("report Item" + title);
        }
    }

    public static void main(String[] args) {
        Report rep = new Report("sales report");
        Report.Item item = rep.new Item(); //assim que se instancia uma inner class não-estática

        item.show();
    }
}
