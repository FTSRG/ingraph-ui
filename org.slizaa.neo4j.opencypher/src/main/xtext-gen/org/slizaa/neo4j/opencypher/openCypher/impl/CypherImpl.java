/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.neo4j.opencypher.openCypher.Cypher;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;
import org.slizaa.neo4j.opencypher.openCypher.QueryOptions;
import org.slizaa.neo4j.opencypher.openCypher.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cypher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.CypherImpl#getQueryOptions <em>Query Options</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.CypherImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CypherImpl extends MinimalEObjectImpl.Container implements Cypher
{
  /**
   * The cached value of the '{@link #getQueryOptions() <em>Query Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryOptions()
   * @generated
   * @ordered
   */
  protected QueryOptions queryOptions;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CypherImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OpenCypherPackage.Literals.CYPHER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryOptions getQueryOptions()
  {
    return queryOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQueryOptions(QueryOptions newQueryOptions, NotificationChain msgs)
  {
    QueryOptions oldQueryOptions = queryOptions;
    queryOptions = newQueryOptions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.CYPHER__QUERY_OPTIONS, oldQueryOptions, newQueryOptions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryOptions(QueryOptions newQueryOptions)
  {
    if (newQueryOptions != queryOptions)
    {
      NotificationChain msgs = null;
      if (queryOptions != null)
        msgs = ((InternalEObject)queryOptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.CYPHER__QUERY_OPTIONS, null, msgs);
      if (newQueryOptions != null)
        msgs = ((InternalEObject)newQueryOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.CYPHER__QUERY_OPTIONS, null, msgs);
      msgs = basicSetQueryOptions(newQueryOptions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.CYPHER__QUERY_OPTIONS, newQueryOptions, newQueryOptions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.CYPHER__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.CYPHER__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.CYPHER__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.CYPHER__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OpenCypherPackage.CYPHER__QUERY_OPTIONS:
        return basicSetQueryOptions(null, msgs);
      case OpenCypherPackage.CYPHER__STATEMENT:
        return basicSetStatement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OpenCypherPackage.CYPHER__QUERY_OPTIONS:
        return getQueryOptions();
      case OpenCypherPackage.CYPHER__STATEMENT:
        return getStatement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.CYPHER__QUERY_OPTIONS:
        setQueryOptions((QueryOptions)newValue);
        return;
      case OpenCypherPackage.CYPHER__STATEMENT:
        setStatement((Statement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.CYPHER__QUERY_OPTIONS:
        setQueryOptions((QueryOptions)null);
        return;
      case OpenCypherPackage.CYPHER__STATEMENT:
        setStatement((Statement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.CYPHER__QUERY_OPTIONS:
        return queryOptions != null;
      case OpenCypherPackage.CYPHER__STATEMENT:
        return statement != null;
    }
    return super.eIsSet(featureID);
  }

} //CypherImpl
