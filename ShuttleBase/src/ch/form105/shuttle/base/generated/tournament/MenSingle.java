/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: MenSingle.java,v 1.1 2006/05/14 10:28:16 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.tournament;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class MenSingle.
 * 
 * @version $Revision: 1.1 $ $Date: 2006/05/14 10:28:16 $
 */
public class MenSingle extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _categorySingle
     */
    private java.lang.String _categorySingle;

    /**
     * Field _categoryDouble
     */
    private java.lang.String _categoryDouble;

    /**
     * Field _categoryMixed
     */
    private java.lang.String _categoryMixed;

    /**
     * Field _active
     */
    private boolean _active;

    /**
     * keeps track of state for field: _active
     */
    private boolean _has_active;

    /**
     * Field _results
     */
    private ch.form105.shuttle.base.generated.tournament.Results _results;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public MenSingle() 
     {
        super();
    } //-- ch.form105.shuttle.base.generated.tournament.MenSingle()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPropertyChangeListener
     * 
     * Registers a PropertyChangeListener with this class.
     * 
     * @param pcl The PropertyChangeListener to register.
     */
    public void addPropertyChangeListener(java.beans.PropertyChangeListener pcl)
    {
        if (propertyChangeSupport == null) {
            propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
        }
        propertyChangeSupport.addPropertyChangeListener(pcl);
    } //-- void addPropertyChangeListener(java.beans.PropertyChangeListener) 

    /**
     * Method deleteActive
     * 
     */
    public void deleteActive()
    {
        this._has_active= false;
        notifyPropertyChangeListeners("_active", (this._active ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE), null);
    } //-- void deleteActive() 

    /**
     * Returns the value of field 'active'.
     * 
     * @return boolean
     * @return the value of field 'active'.
     */
    public boolean getActive()
    {
        return this._active;
    } //-- boolean getActive() 

    /**
     * Returns the value of field 'categoryDouble'.
     * 
     * @return String
     * @return the value of field 'categoryDouble'.
     */
    public java.lang.String getCategoryDouble()
    {
        return this._categoryDouble;
    } //-- java.lang.String getCategoryDouble() 

    /**
     * Returns the value of field 'categoryMixed'.
     * 
     * @return String
     * @return the value of field 'categoryMixed'.
     */
    public java.lang.String getCategoryMixed()
    {
        return this._categoryMixed;
    } //-- java.lang.String getCategoryMixed() 

    /**
     * Returns the value of field 'categorySingle'.
     * 
     * @return String
     * @return the value of field 'categorySingle'.
     */
    public java.lang.String getCategorySingle()
    {
        return this._categorySingle;
    } //-- java.lang.String getCategorySingle() 

    /**
     * Returns the value of field 'results'.
     * 
     * @return Results
     * @return the value of field 'results'.
     */
    public ch.form105.shuttle.base.generated.tournament.Results getResults()
    {
        return this._results;
    } //-- ch.form105.shuttle.base.generated.tournament.Results getResults() 

    /**
     * Method hasActive
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasActive()
    {
        return this._has_active;
    } //-- boolean hasActive() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method notifyPropertyChangeListeners
     * 
     * Notifies all registered PropertyChangeListeners when a bound
     * property's value changes.
     * 
     * @param fieldName the name of the property that has changed.
     * @param newValue the new value of the property.
     * @param oldValue the old value of the property.
     */
    protected void notifyPropertyChangeListeners(java.lang.String fieldName, java.lang.Object oldValue, java.lang.Object newValue)
    {
        if (propertyChangeSupport == null) return;
        propertyChangeSupport.firePropertyChange(fieldName,oldValue,newValue);
    } //-- void notifyPropertyChangeListeners(java.lang.String, java.lang.Object, java.lang.Object) 

    /**
     * Method removePropertyChangeListener
     * 
     * Removes the given PropertyChangeListener from this classes
     * list of ProperyChangeListeners.
     * 
     * @param pcl The PropertyChangeListener to remove.
     * @return boolean
     */
    public boolean removePropertyChangeListener(java.beans.PropertyChangeListener pcl)
    {
        if (propertyChangeSupport == null) return false;
        propertyChangeSupport.removePropertyChangeListener(pcl);
        return true;
    } //-- boolean removePropertyChangeListener(java.beans.PropertyChangeListener) 

    /**
     * Sets the value of field 'active'.
     * 
     * @param active the value of field 'active'.
     */
    public void setActive(boolean active)
    {
        java.lang.Object oldActive = (this._active ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
        this._active = active;
        this._has_active = true;
        notifyPropertyChangeListeners("_active", oldActive, (this._active ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
    } //-- void setActive(boolean) 

    /**
     * Sets the value of field 'categoryDouble'.
     * 
     * @param categoryDouble the value of field 'categoryDouble'.
     */
    public void setCategoryDouble(java.lang.String categoryDouble)
    {
        java.lang.Object oldCategoryDouble = this._categoryDouble;
        this._categoryDouble = categoryDouble;
        notifyPropertyChangeListeners("_categoryDouble", oldCategoryDouble, this._categoryDouble);
    } //-- void setCategoryDouble(java.lang.String) 

    /**
     * Sets the value of field 'categoryMixed'.
     * 
     * @param categoryMixed the value of field 'categoryMixed'.
     */
    public void setCategoryMixed(java.lang.String categoryMixed)
    {
        java.lang.Object oldCategoryMixed = this._categoryMixed;
        this._categoryMixed = categoryMixed;
        notifyPropertyChangeListeners("_categoryMixed", oldCategoryMixed, this._categoryMixed);
    } //-- void setCategoryMixed(java.lang.String) 

    /**
     * Sets the value of field 'categorySingle'.
     * 
     * @param categorySingle the value of field 'categorySingle'.
     */
    public void setCategorySingle(java.lang.String categorySingle)
    {
        java.lang.Object oldCategorySingle = this._categorySingle;
        this._categorySingle = categorySingle;
        notifyPropertyChangeListeners("_categorySingle", oldCategorySingle, this._categorySingle);
    } //-- void setCategorySingle(java.lang.String) 

    /**
     * Sets the value of field 'results'.
     * 
     * @param results the value of field 'results'.
     */
    public void setResults(ch.form105.shuttle.base.generated.tournament.Results results)
    {
        java.lang.Object oldResults = this._results;
        this._results = results;
        notifyPropertyChangeListeners("_results", oldResults, this._results);
    } //-- void setResults(ch.form105.shuttle.base.generated.tournament.Results) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return MenSingle
     */
    public static ch.form105.shuttle.base.generated.tournament.MenSingle unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.MenSingle) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.MenSingle.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.MenSingle unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
