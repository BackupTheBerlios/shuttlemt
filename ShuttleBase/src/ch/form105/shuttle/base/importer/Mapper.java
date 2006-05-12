package ch.form105.shuttle.base.importer;

public abstract class Mapper {

	abstract void map();
	abstract Object[] getResult();
	abstract void setLoaderInput(LoaderInput input);
	abstract Object[] getHeader();

}
