package org.bouncycastle.oer.its.ieee1609dot2;

import java.math.BigInteger;

import org.bouncycastle.asn1.ASN1Integer;

/**
 * PduFunctionalType ::= INTEGER (0..255)
 * tlsHandshake          PduFunctionalType ::= 1
 * iso21177ExtendedAuth  PduFunctionalType ::= 2
 */
public class PduFunctionalType
    extends ASN1Integer
{

    public static final PduFunctionalType tlsHandshake = new PduFunctionalType(1);
    public static final PduFunctionalType iso21177ExtendedAuth = new PduFunctionalType(2);


    public PduFunctionalType(long value)
    {
        super(value);
    }


    public PduFunctionalType(BigInteger value)
    {
        super(value);
    }

    public PduFunctionalType(byte[] bytes)
    {
        super(bytes);
    }

    public PduFunctionalType(ASN1Integer instance)
    {
        super(instance.getValue());
    }

    public static PduFunctionalType getInstance(Object src)
    {
        if (src instanceof PduFunctionalType)
        {
            return (PduFunctionalType)src;
        }

        if (src != null)
        {
            return new PduFunctionalType(ASN1Integer.getInstance(src));
        }

        return null;
    }
}
