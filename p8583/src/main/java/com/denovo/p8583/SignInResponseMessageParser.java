package com.denovo.p8583;

import com.denovo.p8583.fields.BinaryVarLengthP8583Field;

public class SignInResponseMessageParser extends DefaultResponseMessageParser{
    @Override
    public void Init(P8583Fields fields) {
        super.Init(fields);
        fields.addP8583ItemAt(62, new BinaryVarLengthP8583Field(72, 3, true));
    }
}
