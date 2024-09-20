	
public class Activity8 {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;
 
    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();
 
        // Server Address
        URL serverURL = new URI("http://localhost:4723").toURL();
 
        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
        // Open the page in Chrome
        driver.get("https://v1.training-support.net/selenium/lazy-loading");
    }
 
    // Test method
    @Test
    public void scrollTest() {
    	// Wait for page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.Image")));
        
        // Get the size of the screen
        Dimension dims = driver.manage().window().getSize();
        // Set the start and end points
        Point start = new Point((int)(dims.getWidth() * .50), (int)(dims.getHeight() * .85));
        Point end = new Point((int)(dims.getWidth() * .50), (int)(dims.getHeight() * .20));
        
        // Find all the image elements on the page
        List<WebElement> imageElements = driver.findElements(AppiumBy.className("android.widget.Image"));
 
        // Print the number of images
        System.out.println("Before scroll: " + imageElements.size());
        
        // Scroll down to Helen
        doSwipe(driver, start, end, 200);
 
        // Get image elements after scroll
        imageElements = driver.findElements(AppiumBy.className("android.widget.Image"));
 
        // Print the number of images after scroll
        System.out.println("After scroll: " + imageElements.size());
 
        // Assertions
        Assert.assertEquals(imageElements.size(), 3);
    }
 
 
    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}