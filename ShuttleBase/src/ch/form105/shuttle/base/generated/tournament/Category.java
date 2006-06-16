/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Category.java,v 1.1 2006/06/16 19:35:49 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.tournament;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import ch.form105.shuttle.base.generated.tournament.types.CategoryCatIdType;
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
 * Class Category.
 * 
 * @version $Revision: 1.1 $ $Date: 2006/06/16 19:35:49 $
 */
public class Category extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _catId
     */
    private ch.form105.shuttle.base.generated.tournament.types.CategoryCatIdType _catId;

    /**
     * Field _playerIdList
     */
    private java.util.ArrayList _playerIdList;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Category() 
     {
        super();
        _playerIdList = new ArrayList();
    } //-- ch.form105.shuttle.base.generated.tournament.Category()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPlayerId
     * 
     * 
     * 
     * @param vPlayerId
     */
    public void addPlayerId(java.lang.String vPlayerId)
        throws java.lang.IndexOutOfBoundsException
    {
        _playerIdList.add(vPlayerId);
        notifyPropertyChangeListeners("_playerIdList", null, _playerIdList);
    } //-- void addPlayerId(java.lang.String) 

    /**
     * Method addPlayerId
     * 
     * 
     * 
     * @param index
     * @param vPlayerId
     */
    public void addPlayerId(int index, java.lang.String vPlayerId)
        throws java.lang.IndexOutOfBoundsException
    {
        _playerIdList.add(index, vPlayerId);
        notifyPropertyChangeListeners("_playerIdList", null, _playerIdList);
    } //-- void addPlayerId(int, java.lang.String) 

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
     * Method clearPlayerId
     * 
     */
    public void clearPlayerId()
    {
        _playerIdList.clear();
        notifyPropertyChangeListeners("_playerIdList", null, _playerIdList);
    } //-- void clearPlayerId() 

    /**
     * Method enumeratePlayerId
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumeratePlayerId()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_playerIdList.iterator());
    } //-- java.util.Enumeration enumeratePlayerId() 

    /**
     * Returns the value of field 'catId'.
     * 
     * @return CategoryCatIdType
     * @return the value of field 'catId'.
     */
    public ch.form105.shuttle.base.generated.tournament.types.CategoryCatIdType getCatId()
    {
        return this._catId;
    } //-- ch.form105.shuttle.base.generated.tournament.types.CategoryCatIdType getCatId() 

    /**
     * Method getPlayerId
     * 
     * 
     * 
     * @param index
     * @return String
     */
    public java.lang.String getPlayerId(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _playerIdList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_playerIdList.get(index);
    } //-- java.lang.String getPlayerId(int) 

    /**
     * Method getPlayerId
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String[] getPlayerId()
    {
        int size = _playerIdList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_playerIdList.get(index);
        }
        return mArray;
    } //-- java.lang.String[] getPlayerId() 

    /**
     * Method getPlayerIdCount
     * 
     * 
     * 
     * @return int
     */
    public int getPlayerIdCount()
    {
        return _playerIdList.size();
    } //-- int getPlayerIdCount() 

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
     * Method removePlayerId
     * 
     * 
     * 
     * @param vPlayerId
     * @return boolean
     */
    public boolean removePlayerId(java.lang.String vPlayerId)
    {
        boolean removed = _playerIdList.remove(vPlayerId);
        notifyPropertyChangeListeners("_playerIdList", null, _playerIdList);
        return removed;
    } //-- boolean removePlayerId(java.lang.String) 

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
     * Sets the value of field 'catId'.
     * 
     * @param catId the value of field 'catId'.
     */
    public void setCatId(ch.form105.shuttle.base.generated.tournament.types.CategoryCatIdType catId)
    {
        java.lang.Object oldCatId = this._catId;
        this._catId = catId;
        notifyPropertyChangeListeners("_catId", oldCatId, this._catId);
    } //-- void setCatId(ch.form105.shuttle.base.generated.tournament.types.CategoryCatIdType) 

    /**
     * Method setPlayerId
     * 
     * 
     * 
     * @param index
     * @param vPlayerId
     */
    public void setPlayerId(int index, java.lang.String vPlayerId)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _playerIdList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _playerIdList.set(index, vPlayerId);
        notifyPropertyChangeListeners("_playerIdList", null, _playerIdList);
    } //-- void setPlayerId(int, java.lang.String) 

    /**
     * Method setPlayerId
     * 
     * 
     * 
     * @param playerIdArray
     */
    public void setPlayerId(java.lang.String[] playerIdArray)
    {
        //-- copy array
        _playerIdList.clear();
        for (int i = 0; i < playerIdArray.length; i++) {
            _playerIdList.add(playerIdArray[i]);
        }
        notifyPropertyChangeListeners("_playerIdList", null, _playerIdList);
    } //-- void setPlayerId(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Category
     */
    public static ch.form105.shuttle.base.generated.tournament.Category unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.Category) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.Category.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.Category unmarshal(java.io.Reader) 

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
