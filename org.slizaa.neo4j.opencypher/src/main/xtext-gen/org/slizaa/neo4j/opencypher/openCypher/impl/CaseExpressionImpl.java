/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.neo4j.opencypher.openCypher.CaseAlternatives;
import org.slizaa.neo4j.opencypher.openCypher.CaseExpression;
import org.slizaa.neo4j.opencypher.openCypher.Expression;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.CaseExpressionImpl#getCaseAlternatives <em>Case Alternatives</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.CaseExpressionImpl#getCaseExpression <em>Case Expression</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.CaseExpressionImpl#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseExpressionImpl extends ExpressionImpl implements CaseExpression
{
  /**
   * The cached value of the '{@link #getCaseAlternatives() <em>Case Alternatives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseAlternatives()
   * @generated
   * @ordered
   */
  protected EList<CaseAlternatives> caseAlternatives;

  /**
   * The cached value of the '{@link #getCaseExpression() <em>Case Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseExpression()
   * @generated
   * @ordered
   */
  protected Expression caseExpression;

  /**
   * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseExpression()
   * @generated
   * @ordered
   */
  protected Expression elseExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseExpressionImpl()
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
    return OpenCypherPackage.Literals.CASE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CaseAlternatives> getCaseAlternatives()
  {
    if (caseAlternatives == null)
    {
      caseAlternatives = new EObjectContainmentEList<CaseAlternatives>(CaseAlternatives.class, this, OpenCypherPackage.CASE_EXPRESSION__CASE_ALTERNATIVES);
    }
    return caseAlternatives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCaseExpression()
  {
    return caseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseExpression(Expression newCaseExpression, NotificationChain msgs)
  {
    Expression oldCaseExpression = caseExpression;
    caseExpression = newCaseExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.CASE_EXPRESSION__CASE_EXPRESSION, oldCaseExpression, newCaseExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseExpression(Expression newCaseExpression)
  {
    if (newCaseExpression != caseExpression)
    {
      NotificationChain msgs = null;
      if (caseExpression != null)
        msgs = ((InternalEObject)caseExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.CASE_EXPRESSION__CASE_EXPRESSION, null, msgs);
      if (newCaseExpression != null)
        msgs = ((InternalEObject)newCaseExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.CASE_EXPRESSION__CASE_EXPRESSION, null, msgs);
      msgs = basicSetCaseExpression(newCaseExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.CASE_EXPRESSION__CASE_EXPRESSION, newCaseExpression, newCaseExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getElseExpression()
  {
    return elseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseExpression(Expression newElseExpression, NotificationChain msgs)
  {
    Expression oldElseExpression = elseExpression;
    elseExpression = newElseExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION, oldElseExpression, newElseExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseExpression(Expression newElseExpression)
  {
    if (newElseExpression != elseExpression)
    {
      NotificationChain msgs = null;
      if (elseExpression != null)
        msgs = ((InternalEObject)elseExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION, null, msgs);
      if (newElseExpression != null)
        msgs = ((InternalEObject)newElseExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION, null, msgs);
      msgs = basicSetElseExpression(newElseExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION, newElseExpression, newElseExpression));
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
      case OpenCypherPackage.CASE_EXPRESSION__CASE_ALTERNATIVES:
        return ((InternalEList<?>)getCaseAlternatives()).basicRemove(otherEnd, msgs);
      case OpenCypherPackage.CASE_EXPRESSION__CASE_EXPRESSION:
        return basicSetCaseExpression(null, msgs);
      case OpenCypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
        return basicSetElseExpression(null, msgs);
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
      case OpenCypherPackage.CASE_EXPRESSION__CASE_ALTERNATIVES:
        return getCaseAlternatives();
      case OpenCypherPackage.CASE_EXPRESSION__CASE_EXPRESSION:
        return getCaseExpression();
      case OpenCypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
        return getElseExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.CASE_EXPRESSION__CASE_ALTERNATIVES:
        getCaseAlternatives().clear();
        getCaseAlternatives().addAll((Collection<? extends CaseAlternatives>)newValue);
        return;
      case OpenCypherPackage.CASE_EXPRESSION__CASE_EXPRESSION:
        setCaseExpression((Expression)newValue);
        return;
      case OpenCypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
        setElseExpression((Expression)newValue);
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
      case OpenCypherPackage.CASE_EXPRESSION__CASE_ALTERNATIVES:
        getCaseAlternatives().clear();
        return;
      case OpenCypherPackage.CASE_EXPRESSION__CASE_EXPRESSION:
        setCaseExpression((Expression)null);
        return;
      case OpenCypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
        setElseExpression((Expression)null);
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
      case OpenCypherPackage.CASE_EXPRESSION__CASE_ALTERNATIVES:
        return caseAlternatives != null && !caseAlternatives.isEmpty();
      case OpenCypherPackage.CASE_EXPRESSION__CASE_EXPRESSION:
        return caseExpression != null;
      case OpenCypherPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
        return elseExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //CaseExpressionImpl
