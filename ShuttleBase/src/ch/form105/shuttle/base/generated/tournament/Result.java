/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Result.java,v 1.3 2006/06/10 18:17:55 luschtiger Exp $
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
 * Class Result.
 * 
 * @version $Revision: 1.3 $ $Date: 2006/06/10 18:17:55 $
 */
public class Result extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _antagonist
     */
    private java.lang.String _antagonist;

    /**
     * Field _amountList
     */
    private java.util.ArrayList _amountList;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Result() 
     {
        super();
        _amountList = new ArrayList();
    } //-- ch.form105.shuttle.base.generated.tournament.Result()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAmount
     * 
     * 
     * 
     * @param vAmount
     */
    public void addAmount(java.lang.String vAmount)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_amountList.size() < 3)) {
            throw new IndexOutOfBoundsException();
        }
        _amountList.add(vAmount);
        notifyPropertyChangeListeners("_amountList", null, _amountList);
    } //-- void addAmount(java.lang.String) 

    /**
     * Method addAmount
     * 
     * 
     * 
     * @param index
     * @param vAmount
     */
    public void addAmount(int index, java.lang.String vAmount)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_amountList.size() < 3)) {
            throw new IndexOutOfBoundsException();
        }
        _amountList.add(index, vAmount);
        notifyPropertyChangeListeners("_amountList", null, _amountList);
    } //-- void addAmount(int, java.lang.String) 

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
     * Method clearAmount
     * 
     */
    public void clearAmount()
    {
        _amountList.clear();
        notifyPropertyChangeListeners("_amountList", null, _amountList);
    } //-- void clearAmount() 

    /**
     * Method enumerateAmount
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateAmount()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_amountList.iterator());
    } //-- java.util.Enumeration enumerateAmount() 

    /**
     * Method getAmount
     * 
     * 
     * 
     * @param index
     * @return String
     */
    public java.lang.String getAmount(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _amountList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_amountList.get(index);
    } //-- java.lang.String getAmount(int) 

    /**
     * Method getAmount
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String[] getAmount()
    {
        int size = _amountList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_amountList.get(index);
        }
        return mArray;
    } //-- java.lang.String[] getAmount() 

    /**
     * Method getAmountCount
     * 
     * 
     * 
     * @return int
     */
    public int getAmountCount()
    {
        return _amountList.size();
    } //-- int getAmountCount() 

    /**
     * Returns the value of field 'antagonist'.
     * 
     * @return String
     * @return the value of field 'antagonist'.
     */
    public java.lang.String getAntagonist()
    {
        return this._antagonist;
    } //-- java.lang.String getAntagonist() 

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
     * Method removeAmount
     * 
     * 
     * 
     * @param vAmount
     * @return boolean
     */
    public boolean removeAmount(java.lang.String vAmount)
    {
        boolean removed = _amountList.remove(vAmount);
        notifyPropertyChangeListeners("_amountList", null, _amountList);
        return removed;
    } //-- boolean removeAmount(java.lang.String) 

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
     * Method setAmount
     * 
     * 
     * 
     * @param index
     * @param vAmount
     */
    public void setAmount(int index, java.lang.String vAmount)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _amountList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 3)) {
            throw new IndexOutOfBoundsException();
        }
        _amountList.set(index, vAmount);
        notifyPropertyChangeListeners("_amountList", null, _amountList);
    } //-- void setAmount(int, java.lang.String) 

    /**
     * Method setAmount
     * 
     * 
     * 
     * @param amountArray
     */
    public void setAmount(java.lang.String[] amountArray)
    {
        //-- copy array
        _amountList.clear();
        for (int i = 0; i < amountArray.length; i++) {
            _amountList.add(amountArray[i]);
        }
        notifyPropertyChangeListeners("_amountList", null, _amountList);
    } //-- void setAmount(java.lang.String) 

    /**
     * Sets the value of field 'antagonist'.
     * 
     * @param antagonist the value of field 'antagonist'.
     */
    public void setAntagonist(java.lang.String antagonist)
    {
        java.lang.Object oldAntagonist = this._antagonist;
        this._antagonist = antagonist;
        notifyPropertyChangeListeners("_antagonist", oldAntagonist, this._antagonist);
    } //-- void setAntagonist(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Result
     */
    public static ch.form105.shuttle.base.generated.tournament.Result unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.Result) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.Result.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.Result unmarshal(java.io.Reader) 

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
