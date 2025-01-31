package wrapper;

public interface Wrapper {

	public void invokeAppUrl(String browsername,String url);
	public void findByName(String namelocator,String data);
	public void findById(String IdLocator,String data);
	public void findByXpath(String xpath,String data);
    public void findByNameClick(String name);//for click ,check 
    public void findByIdClick(String id);
    public void findByXpathClick(String xpath);
    public void findByCssClick(String csssel);
    public void selectbyVisibleTextById(String id ,String text);
	
	public void selectbyVisibleTextByName(String name ,String text);

	public void selectbyVisibleTextByXpath(String xpath ,String text);
	
	public void selectIndexById(String id, int index);
	
	public void selectIndexByName(String name, int index);
	
	public void selectIndexByXpath(String xpath,int index);
	
	public void selectValueById(String id ,String value);
	
	public void selectValueByName(String name ,String value);
	
	public void selectValueByXpath(String xpath ,String value);
	public String getTextbyCss(String css);
	
	 public void windowscroll();
	
	public void sleep(long time);
	
	//public void webdriverwait(duration time,String untilconditions);
	
	public void closeBrowser();
	
	public void closeAllbrowsers();
	
}
