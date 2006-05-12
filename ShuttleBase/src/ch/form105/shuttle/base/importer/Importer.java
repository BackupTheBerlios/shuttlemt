package ch.form105.shuttle.base.importer;

public class Importer {

	LoaderInput loaderInput = new CSVLoaderInput();

	Mapper mapper;

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
		return mapper.getResult();
	}
	
	public Object[] getHeader() {
		return mapper.getHeader();
	}

}
