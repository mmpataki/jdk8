package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/InvalidSlot.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u11/648/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Monday, June 16, 2014 5:30:31 PM PDT
*/

public final class InvalidSlot extends org.omg.CORBA.UserException
{

  public InvalidSlot ()
  {
    super(InvalidSlotHelper.id());
  } // ctor


  public InvalidSlot (String $reason)
  {
    super(InvalidSlotHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidSlot