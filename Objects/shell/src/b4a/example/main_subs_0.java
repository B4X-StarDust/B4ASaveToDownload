package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(134217728);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 39;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="DownloadAndSave";
Debug.ShouldStop(128);
_downloadandsave();
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _downloadandsave() throws Exception{
try {
		Debug.PushSubsStack("DownloadAndSave (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("downloadandsave")) { b4a.example.main.remoteMe.runUserSub(false, "main","downloadandsave"); return;}
ResumableSub_DownloadAndSave rsub = new ResumableSub_DownloadAndSave(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadAndSave extends BA.ResumableSub {
public ResumableSub_DownloadAndSave(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _j = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _data = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadAndSave (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 45;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(4096);
_j = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 46;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(8192);
_j.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 47;BA.debugLine="j.Download(\"http://www.s-dev.it/favicon.ico\")";
Debug.ShouldStop(16384);
_j.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("http://www.s-dev.it/favicon.ico")));
 BA.debugLineNum = 48;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadandsave"), (_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 49;BA.debugLine="If j.Success Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 50;BA.debugLine="Log(\"Download\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","1851974",RemoteObject.createImmutable("Download"),0);
 BA.debugLineNum = 51;BA.debugLine="Dim Data() As Byte = Bit.InputStreamToBytes(j.Ge";
Debug.ShouldStop(262144);
_data = parent.mostCurrent.__c.getField(false,"Bit").runMethod(false,"InputStreamToBytes",(Object)((_j.runClassMethod (b4a.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())));Debug.locals.put("Data", _data);Debug.locals.put("Data", _data);
 BA.debugLineNum = 52;BA.debugLine="SaveFileToDownloads(Data, \"favicon.ico\")";
Debug.ShouldStop(524288);
_savefiletodownloads(_data,RemoteObject.createImmutable("favicon.ico"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 54;BA.debugLine="LogColor(j.ErrorMessage,Colors.Magenta)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","1851978",_j.getField(true,"_errormessage" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 55;BA.debugLine="xui.MsgboxAsync(j.ErrorMessage , \"Error\")";
Debug.ShouldStop(4194304);
parent._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence(_j.getField(true,"_errormessage" /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 57;BA.debugLine="j.Release";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _getmediastoredownloadsuri() throws Exception{
try {
		Debug.PushSubsStack("GetMediaStoreDownloadsUri (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,89);
if (RapidSub.canDelegate("getmediastoredownloadsuri")) { return b4a.example.main.remoteMe.runUserSub(false, "main","getmediastoredownloadsuri");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 89;BA.debugLine="Sub GetMediaStoreDownloadsUri As Object";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(33554432);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 91;BA.debugLine="jo.InitializeStatic(\"android.provider.MediaStore$";
Debug.ShouldStop(67108864);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.provider.MediaStore$Downloads")));
 BA.debugLineNum = 92;BA.debugLine="Return jo.GetField(\"EXTERNAL_CONTENT_URI\")";
Debug.ShouldStop(134217728);
if (true) return _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("EXTERNAL_CONTENT_URI")));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savefiletodownloads(RemoteObject _data,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SaveFileToDownloads (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("savefiletodownloads")) { return b4a.example.main.remoteMe.runUserSub(false, "main","savefiletodownloads", _data, _filename);}
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _contentvalues = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _resolver = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _uri = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _os = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("data", _data);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 60;BA.debugLine="Sub SaveFileToDownloads(data() As Byte, FileName A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(268435456);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 62;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(536870912);
_ctxt.runVoidMethod ("InitializeContext",main.processBA);
 BA.debugLineNum = 64;BA.debugLine="Dim ContentValues As JavaObject";
Debug.ShouldStop(-2147483648);
_contentvalues = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ContentValues", _contentvalues);
 BA.debugLineNum = 65;BA.debugLine="ContentValues.InitializeNewInstance(\"android.cont";
Debug.ShouldStop(1);
_contentvalues.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.ContentValues")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 67;BA.debugLine="ContentValues.RunMethod(\"put\", Array(\"title\", Fil";
Debug.ShouldStop(4);
_contentvalues.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("put")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("title")),(_filename)})));
 BA.debugLineNum = 68;BA.debugLine="ContentValues.RunMethod(\"put\", Array(\"mime_type\",";
Debug.ShouldStop(8);
_contentvalues.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("put")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("mime_type")),(RemoteObject.createImmutable("application/json"))})));
 BA.debugLineNum = 69;BA.debugLine="ContentValues.RunMethod(\"put\", Array(\"relative_pa";
Debug.ShouldStop(16);
_contentvalues.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("put")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("relative_path")),(RemoteObject.createImmutable("Download/"))})));
 BA.debugLineNum = 72;BA.debugLine="Dim resolver As JavaObject = ctxt.RunMethod(\"getC";
Debug.ShouldStop(128);
_resolver = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_resolver = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _ctxt.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getContentResolver")),(Object)((main.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("resolver", _resolver);Debug.locals.put("resolver", _resolver);
 BA.debugLineNum = 73;BA.debugLine="Dim uri As JavaObject = resolver.RunMethod(\"inser";
Debug.ShouldStop(256);
_uri = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_uri = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _resolver.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("insert")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_getmediastoredownloadsuri(),(_contentvalues.getObject())}))));Debug.locals.put("uri", _uri);Debug.locals.put("uri", _uri);
 BA.debugLineNum = 75;BA.debugLine="If uri.IsInitialized Then";
Debug.ShouldStop(1024);
if (_uri.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="Dim os As OutputStream";
Debug.ShouldStop(2048);
_os = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("os", _os);
 BA.debugLineNum = 77;BA.debugLine="os = resolver.RunMethod(\"openOutputStream\", Arra";
Debug.ShouldStop(4096);
_os = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper"), _resolver.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("openOutputStream")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_uri.getObject())}))));Debug.locals.put("os", _os);
 BA.debugLineNum = 78;BA.debugLine="os.WriteBytes(data, 0, data.Length)";
Debug.ShouldStop(8192);
_os.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 79;BA.debugLine="os.Close";
Debug.ShouldStop(16384);
_os.runVoidMethod ("Close");
 BA.debugLineNum = 80;BA.debugLine="Log(\"✅ File salvato con successo in Download: \"";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1786452",RemoteObject.concat(RemoteObject.createImmutable("✅ File salvato con successo in Download: "),_filename),0);
 BA.debugLineNum = 81;BA.debugLine="ToastMessageShow(\"File downloaded\", False)";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("File downloaded")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 83;BA.debugLine="Log(\"❌ Errore nel salvataggio del file\")";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1786455",RemoteObject.createImmutable("❌ Errore nel salvataggio del file"),0);
 BA.debugLineNum = 84;BA.debugLine="ToastMessageShow(\"ERROR\", False)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ERROR")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}