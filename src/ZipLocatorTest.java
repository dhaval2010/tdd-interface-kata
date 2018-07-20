import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ZipLocatorTest {

	@Test
	public void checkIf400708ReturnsNaviMumbai() {
		// Prepare
		LocatorService locatorService = Mockito.mock(LocatorService.class);
		Mockito.when(locatorService.getLocation(400708)).thenReturn(
				"Navi Mumbai");
		Mockito.when(locatorService.getLocation(400800)).thenReturn("Mumbai");
		ZipLocator locator = new ZipLocator(locatorService);

		// Execute
		String location400708 = locator.getLocation(400708);
		String location400800 = locator.getLocation(400800);

		// Assertion
		Assert.assertEquals("Navi Mumbai", location400708);
		Assert.assertEquals("Mumbai", location400800);
	}
}