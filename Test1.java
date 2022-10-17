public class Test1 {
    public static void main(String[] args) {
        for (PageInfo page : PageInfo.values() )
        System.out.println(page + " ID: " + page.getPageID() + " Title: " + page.getPageTitle() +
                " URL: " + page.getPageURL());
    }
}
