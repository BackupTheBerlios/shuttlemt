package ch.form105.shuttle.base.importer;

public class Importer {

	LoaderInput loaderInput = new CSVLoaderInput();

	Mapper mapper;
	
	Object[] elements = null;
	Object[] header = null;

	public Importer(LoaderInput loader, Mapper mapper) {
		this.loaderInput = loader;
		this.mapper = mapper;
		mapper.setLoaderInput(loaderInput);
	}

	public void doImport() {
		mapper.map();
	}

	public void setLoaderInput(LoaderInput loader) {
		this.loaderInput = loader;
	}
	
	//public void setLoaderInput(LoaderInput loader, String filename);

	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}

	public Object[] getElements() {
		if (elements == null) {
			elements = mapper.getResult();
		}
		
		return elements;
	}
	
	public Object[] getHeader() {
		if (header == null) {
			header = mapper.getHeader();
		}
		return header;
	}

}
