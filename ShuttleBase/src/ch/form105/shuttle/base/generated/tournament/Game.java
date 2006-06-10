/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Game.java,v 1.2 2006/06/10 18:17:55 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.tournament;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import ch.form105.shuttle.base.generated.tournament.types.CategoryType;
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
 * Class Game.
 * 
 * @version $Revision: 1.2 $ $Date: 2006/06/10 18:17:55 $
 */
public class Game extends ch.form105.shuttle.base.Element 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxPoints
     */
    private int _maxPoints = 21;

    /**
     * keeps track of state for field: _maxPoints
     */
    private boolean _has_maxPoints;

    /**
     * Field _typeId
     */
    private java.lang.String _typeId;

    /**
     * Field _active
     */
    private boolean _active;

    /**
     * keeps track of state for field: _active
     */
    private boolean _has_active;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _playerIdList
     */
    private java.util.ArrayList _playerIdList;

    /**
     * Field _category
     */
    private ch.form105.shuttle.base.generated.tournament.types.CategoryType _category;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    public Game() 
     {
        super();
        _playerIdList = new ArrayList();
    } //-- ch.form105.shuttle.base.generated.tournament.Game()


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
     * Method deleteActive
     * 
     */
    public void deleteActive()
    {
        this._has_active= false;
        notifyPropertyChangeListeners("_active", (this._active ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE), null);
    } //-- void deleteActive() 

    /**
     * Method deleteMaxPoints
     * 
     */
    public void deleteMaxPoints()
    {
        this._has_maxPoints= false;
        notifyPropertyChangeListeners("_maxPoints", new java.lang.Integer(this._maxPoints), null);
    } //-- void deleteMaxPoints() 

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
     * Returns the value of field 'category'.
     * 
     * @return CategoryType
     * @return the value of field 'category'.
     */
    public ch.form105.shuttle.base.generated.tournament.types.CategoryType getCategory()
    {
        return this._category;
    } //-- ch.form105.shuttle.base.generated.tournament.types.CategoryType getCategory() 

    /**
     * Returns the value of field 'maxPoints'.
     * 
     * @return int
     * @return the value of field 'maxPoints'.
     */
    public int getMaxPoints()
    {
        return this._maxPoints;
    } //-- int getMaxPoints() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

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
     * Returns the value of field 'typeId'.
     * 
     * @return String
     * @return the value of field 'typeId'.
     */
    public java.lang.String getTypeId()
    {
        return this._typeId;
    } //-- java.lang.String getTypeId() 

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
     * Method hasMaxPoints
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMaxPoints()
    {
        return this._has_maxPoints;
    } //-- boolean hasMaxPoints() 

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
     * Sets the value of field 'category'.
     * 
     * @param category the value of field 'category'.
     */
    public void setCategory(ch.form105.shuttle.base.generated.tournament.types.CategoryType category)
    {
        java.lang.Object oldCategory = this._category;
        this._category = category;
        notifyPropertyChangeListeners("_category", oldCategory, this._category);
    } //-- void setCategory(ch.form105.shuttle.base.generated.tournament.types.CategoryType) 

    /**
     * Sets the value of field 'maxPoints'.
     * 
     * @param maxPoints the value of field 'maxPoints'.
     */
    public void setMaxPoints(int maxPoints)
    {
        java.lang.Object oldMaxPoints = new java.lang.Integer(this._maxPoints);
        this._maxPoints = maxPoints;
        this._has_maxPoints = true;
        notifyPropertyChangeListeners("_maxPoints", oldMaxPoints, new java.lang.Integer(this._maxPoints));
    } //-- void setMaxPoints(int) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        java.lang.Object oldName = this._name;
        this._name = name;
        notifyPropertyChangeListeners("_name", oldName, this._name);
    } //-- void setName(java.lang.String) 

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
     * Sets the value of field 'typeId'.
     * 
     * @param typeId the value of field 'typeId'.
     */
    public void setTypeId(java.lang.String typeId)
    {
        java.lang.Object oldTypeId = this._typeId;
        this._typeId = typeId;
        notifyPropertyChangeListeners("_typeId", oldTypeId, this._typeId);
    } //-- void setTypeId(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Game
     */
    public static ch.form105.shuttle.base.generated.tournament.Game unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (ch.form105.shuttle.base.generated.tournament.Game) Unmarshaller.unmarshal(ch.form105.shuttle.base.generated.tournament.Game.class, reader);
    } //-- ch.form105.shuttle.base.generated.tournament.Game unmarshal(java.io.Reader) 

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
