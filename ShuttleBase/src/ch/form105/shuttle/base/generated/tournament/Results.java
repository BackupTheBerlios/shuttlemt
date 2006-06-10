/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Results.java,v 1.3 2006/06/10 18:17:55 luschtiger Exp $
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
import java.util.ArrayList;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Results.
 * 
 * @version $Revision: 1.3 $ $Date: 2006/06/10 18:17:55 $
 */
public class Results extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resultList
     */
    private java.util.ArrayList _resultList;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Results() 
     {
        super();
        _resultList = new ArrayList();
    } //-- ch.form105.shuttle.base.generated.tournament.Results()


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
     * Method addResult
     * 
     * 
     * 
     * @param vResult
     */
    public void addResult(ch.form105.shuttle.base.generated.tournament.Result vResult)
        throws java.lang.IndexOutOfBoundsException
    {
        _resultList.add(vResult);
        notifyPropertyChangeListeners("_resultList", null, _resultList);
    } //-- void addResult(ch.form105.shuttle.base.generated.tournament.Result) 

    /**
     * Method addResult
     * 
     * 
     * 
     * @param index
     * @param vResult
     */
    public void addResult(int index, ch.form105.shuttle.base.generated.tournament.Result vResult)
        throws java.lang.IndexOutOfBoundsException
    {
        _resultList.add(index, vResult);
        notifyPropertyChangeListeners("_resultList", null, _resultList);
    } //-- void addResult(int, ch.form105.shuttle.base.generated.tournament.Result) 

    /**
     * Method clearResult
     * 
     */
    public void clearResult()
    {
        _resultList.clear();
        notifyPropertyChangeListeners("_resultList", null, _resultList);
    } //-- void clearResult() 

    /**
     * Method enumerateResult
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateResult()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_resultList.iterator());
    } //-- java.util.Enumeration enumerateResult() 

    /**
     * Method getResult
     * 
     * 
     * 
     * @param index
     * @return Result
     */
    public ch.form105.shuttle.base.generated.tournament.Result getResult(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _resultList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (ch.form105.shuttle.base.generated.tournament.Result) _resultList.get(index);
    } //-- ch.form105.shuttle.base.generated.tournament.Result getResult(int) 

    /**
     * Method getResult
     * 
     * 
     * 
     * @return Result
     */
    public ch.form105.shuttle.base.generated.tournament.Result[] getResult()
    {
        int size = _resultList.size();
        ch.form105.shuttle.base.generated.tournament.Result[] mArray = new ch.form105.shuttle.base.generated.tournament.Result[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (ch.form105.shuttle.base.generated.tournament.Result) _resultList.get(index);
        }
        return mArray;
    } //-- ch.form105.shuttle.base.generated.tournament.Result[] getResult() 

    /**
     * Method getResultCount
     * 
     * 
     * 
     * @return int
     */
    public int getResultCount()
    {
        return _resultList.size();
    } //-- int getResultCount() 

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
     * Method removeResult
     * 
     * 
     * 
     * @param vResult
     * @return boolean
     */
    public boolean removeResult(ch.form105.shuttle.base.generated.tournament.Result vResult)
    {
        boolean removed = _resultList.remove(vResult);
        notifyPropertyChangeListeners("_resultList", null, _resultList);
        return removed;
    } //-- boolean removeResult(ch.form105.shuttle.base.generated.tournament.Result) 

    /**
     * Method setResult
     * 
     * 
     * 
     * @param index
     * @param vResult
     */
    public void setResult(int index, ch.form105.shuttle.base.generated.tournament.Result vResult)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _resultList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _resultList.set(index, vResult);
        notifyPropertyChangeListeners("_resultList", null, _resultList);
    } //-- void setResult(int, ch.form105.shuttle.base.generated.tournament.Result) 

    /**
     * Method setResult
     * 
     * 
     * 
     * @param resultArray
     */
    public void setResult(ch.form105.shuttle.base.generated.tournament.Result[] resultArray)
    {
        //-- copy array
        _resultList.clear();
        for (int i = 0; i < resultArray.length; i++) {
            _resultList.add(resultArray[i]);
        }
        notifyPropertyChangeListeners("_resultList", null, _resultList);
    } //-- void setResult(ch.form105.shuttle.base.generated.tournament.Result) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Results
     */
    public static ch.form105.shuttle.base.generated.tournament.Results unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.Results) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.Results.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.Results unmarshal(java.io.Reader) 

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
