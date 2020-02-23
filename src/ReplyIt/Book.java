package ReplyIt;

public class Book {

        private String title;
        private  String author;
        private String tableOfContents="";
        int nextPage=1;

        public Book(String title, String author){
            this.title =title;
            this.author =author;
        }public void addChapter(String titleOfTheChapter,Integer numberOfThepages){
            tableOfContents+="\n"+titleOfTheChapter+"..."+nextPage;
            nextPage+=Integer.valueOf(numberOfThepages)-1;
            System.out.println(nextPage);
            System.out.println( tableOfContents);
        }public int getPages(){
            return nextPage;
        }public String getTableOfContents(){
            return  tableOfContents;

        }
        public String toString(){
            return "Book{ title= " + title + "\n" +
            ", author='" + author + '\'' ;


        }
}


