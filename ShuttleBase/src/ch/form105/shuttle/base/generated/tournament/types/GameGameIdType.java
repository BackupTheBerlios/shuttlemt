/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: GameGameIdType.java,v 1.1 2006/06/16 19:36:35 luschtiger Exp $
 */

package ch.form105.shuttle.base.generated.tournament.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class GameGameIdType.
 * 
 * @version $Revision: 1.1 $ $Date: 2006/06/16 19:36:35 $
 */
public class GameGameIdType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The menSingle type
     */
    public static final int MENSINGLE_TYPE = 0;

    /**
     * The instance of the menSingle type
     */
    public static final GameGameIdType MENSINGLE = new GameGameIdType(MENSINGLE_TYPE, "menSingle");

    /**
     * The menDouble type
     */
    public static final int MENDOUBLE_TYPE = 1;

    /**
     * The instance of the menDouble type
     */
    public static final GameGameIdType MENDOUBLE = new GameGameIdType(MENDOUBLE_TYPE, "menDouble");

    /**
     * The womenSingle type
     */
    public static final int WOMENSINGLE_TYPE = 2;

    /**
     * The instance of the womenSingle type
     */
    public static final GameGameIdType WOMENSINGLE = new GameGameIdType(WOMENSINGLE_TYPE, "womenSingle");

    /**
     * The womenDouble type
     */
    public static final int WOMENDOUBLE_TYPE = 3;

    /**
     * The instance of the womenDouble type
     */
    public static final GameGameIdType WOMENDOUBLE = new GameGameIdType(WOMENDOUBLE_TYPE, "womenDouble");

    /**
     * The mixed type
     */
    public static final int MIXED_TYPE = 4;

    /**
     * The instance of the mixed type
     */
    public static final GameGameIdType MIXED = new GameGameIdType(MIXED_TYPE, "mixed");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;

    /**
     * Field propertyChangeSupport
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport;


      //----------------/
     //- Constructors -/
    //----------------/

    private GameGameIdType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- ch.form105.shuttle.base.generated.tournament.types.GameGameIdType(int, java.lang.String)


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
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * GameGameIdType
     * 
     * @return Enumeration
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getType
     * 
     * Returns the type of this GameGameIdType
     * 
     * @return int
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

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
     * Method init
     * 
     * 
     * 
     * @return Hashtable
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("menSingle", MENSINGLE);
        members.put("menDouble", MENDOUBLE);
        members.put("womenSingle", WOMENSINGLE);
        members.put("womenDouble", WOMENDOUBLE);
        members.put("mixed", MIXED);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method readResolve
     * 
     *  will be called during deserialization to replace the
     * deserialized object with the correct constant instance.
     * <br/>
     * 
     * @return Object
     */
    private java.lang.Object readResolve()
    {
        return valueOf(this.stringValue);
    } //-- java.lang.Object readResolve() 

    /**
     * Method toString
     * 
     * Returns the String representation of this GameGameIdType
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOf
     * 
     * Returns a new GameGameIdType based on the given String
     * value.
     * 
     * @param string
     * @return GameGameIdType
     */
    public static ch.form105.shuttle.base.generated.tournament.types.GameGameIdType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid GameGameIdType";
            throw new IllegalArgumentException(err);
        }
        return (GameGameIdType) obj;
    } //-- ch.form105.shuttle.base.generated.tournament.types.GameGameIdType valueOf(java.lang.String) 

}
