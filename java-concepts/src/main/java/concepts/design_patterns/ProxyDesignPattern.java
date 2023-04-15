package concepts.design_patterns;

//Structural Design Pattern
//to control the access of actual object
//Act as wrapper object or placeholder
//Can implement Lazy loading of actual object in proxy object if object creation is expensive 
public class ProxyDesignPattern {

	public static void main(String[] args) {
		
		WebpagePrxoy webpagePrxoy = new WebpagePrxoy();
		try {
			webpagePrxoy.renderWebpage("www.youtube.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


interface Webpage{
	public void renderWebpage(String url) throws Exception;
}

class WebpageImpl implements Webpage{

	@Override
	public void renderWebpage(String url) {
		System.out.println(url + " Rendered Successfully ");
	}
}

class WebpagePrxoy implements Webpage{
	
	private Webpage webpage;
	
	public WebpagePrxoy() {
		this.webpage = new WebpageImpl();
	}

	@Override
	public void renderWebpage(String url) throws Exception {
		if(url.equalsIgnoreCase("www.youtube.com")) {
			throw new Exception(url + " is blocked by Admin");
		}else {
			webpage.renderWebpage(url);
		}
	}
}
