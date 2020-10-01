/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SrtpCryptoVector extends java.util.AbstractList<SrtpCrypto> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SrtpCryptoVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SrtpCryptoVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_SrtpCryptoVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SrtpCryptoVector(SrtpCrypto[] initialElements) {
    this();
    reserve(initialElements.length);

    for (SrtpCrypto element : initialElements) {
      add(element);
    }
  }

  public SrtpCryptoVector(Iterable<SrtpCrypto> initialElements) {
    this();
    for (SrtpCrypto element : initialElements) {
      add(element);
    }
  }

  public SrtpCrypto get(int index) {
    return doGet(index);
  }

  public SrtpCrypto set(int index, SrtpCrypto e) {
    return doSet(index, e);
  }

  public boolean add(SrtpCrypto e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, SrtpCrypto e) {
    modCount++;
    doAdd(index, e);
  }

  public SrtpCrypto remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public SrtpCryptoVector() {
    this(pjsua2JNI.new_SrtpCryptoVector__SWIG_0(), true);
  }

  public SrtpCryptoVector(SrtpCryptoVector other) {
    this(pjsua2JNI.new_SrtpCryptoVector__SWIG_1(SrtpCryptoVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return pjsua2JNI.SrtpCryptoVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.SrtpCryptoVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.SrtpCryptoVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.SrtpCryptoVector_clear(swigCPtr, this);
  }

  public SrtpCryptoVector(int count, SrtpCrypto value) {
    this(pjsua2JNI.new_SrtpCryptoVector__SWIG_2(count, SrtpCrypto.getCPtr(value), value), true);
  }

  private int doSize() {
    return pjsua2JNI.SrtpCryptoVector_doSize(swigCPtr, this);
  }

  private void doAdd(SrtpCrypto x) {
    pjsua2JNI.SrtpCryptoVector_doAdd__SWIG_0(swigCPtr, this, SrtpCrypto.getCPtr(x), x);
  }

  private void doAdd(int index, SrtpCrypto x) {
    pjsua2JNI.SrtpCryptoVector_doAdd__SWIG_1(swigCPtr, this, index, SrtpCrypto.getCPtr(x), x);
  }

  private SrtpCrypto doRemove(int index) {
    return new SrtpCrypto(pjsua2JNI.SrtpCryptoVector_doRemove(swigCPtr, this, index), true);
  }

  private SrtpCrypto doGet(int index) {
    return new SrtpCrypto(pjsua2JNI.SrtpCryptoVector_doGet(swigCPtr, this, index), false);
  }

  private SrtpCrypto doSet(int index, SrtpCrypto val) {
    return new SrtpCrypto(pjsua2JNI.SrtpCryptoVector_doSet(swigCPtr, this, index, SrtpCrypto.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.SrtpCryptoVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
