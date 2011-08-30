// **********************************************************************
//
// Copyright (c) 2003-2004 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 2.0.0

package Erp;

public interface _ScanSrvOperations
{
    int isExist(String serialno, Ice.Current __current);

    int saveImageFile(String fname, String serialno, byte[] data, String info, Ice.Current __current);
}