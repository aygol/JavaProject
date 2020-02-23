package day54;

public interface WebDriver {
  public abstract   void openBrowser();//abstract come automatically
    void navigateTo(String url);
    void maximize();
    void closeBrowser();
}
