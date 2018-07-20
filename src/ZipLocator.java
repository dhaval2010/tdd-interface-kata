public class ZipLocator {
	private LocatorService service;

	public ZipLocator(LocatorService service) {
		this.service = service;
	}

	public String getLocation(int zipCode) {
		return service.getLocation(zipCode);
	}
}
