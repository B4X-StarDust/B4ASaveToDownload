package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.httpjob");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _multipartfiledata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response = null;
public Object _tag = null;
public String _invalidurl = "";
public String _defaultscheme = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="JobName = Name";
__ref._jobname /*String*/  = _name;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="End Sub";
return "";
}
public String  _download(b4a.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Try";
try {RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="req.InitializeGet(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("92490373",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="req.InitializeGet(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="End Sub";
return null;
}
public String  _release(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "release", true))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return "";
}
public String  _complete(b4a.example.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="taskId = id";
__ref._taskid /*String*/  = BA.NumberToString(_id);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target /*Object*/ ,"JobDone",this);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Return req";
if (true) return __ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return null;
}
public String  _addscheme(b4a.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "addscheme", true))
	 {return ((String) Debug.delegate(ba, "addscheme", new Object[] {_link}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub AddScheme (Link As String) As String";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If DefaultScheme = \"\" Or Link.Contains(\":\") Then";
if ((__ref._defaultscheme /*String*/ ).equals("") || _link.contains(":")) { 
if (true) return _link;};
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Return DefaultScheme & \"://\" & Link";
if (true) return __ref._defaultscheme /*String*/ +"://"+_link;
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=1638424;
 //BA.debugLineNum = 1638424;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=1638428;
 //BA.debugLineNum = 1638428;BA.debugLine="Private Const InvalidURL As String = \"https://inv";
_invalidurl = "https://invalid-url/";
RDebugUtils.currentLine=1638429;
 //BA.debugLineNum = 1638429;BA.debugLine="Public DefaultScheme As String = \"https\"";
_defaultscheme = "https";
RDebugUtils.currentLine=1638430;
 //BA.debugLineNum = 1638430;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4a.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Try";
try {RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="req.InitializeDelete(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("92686981",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="req.InitializeDelete(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4a.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Try";
try {RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("92752517",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="req.InitializeDelete(escapeLink(InvalidURL, Para";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="End Sub";
return "";
}
public String  _escapelink(b4a.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "escapelink", true))
	 {return ((String) Debug.delegate(ba, "escapelink", new Object[] {_link,_parameters}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4a.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Try";
try {RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("92555909",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="req.InitializeGet(escapeLink(InvalidURL, Paramet";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub GetBitmap As Bitmap";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
_b = __c.LoadBitmap(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapresize(b4a.example.httpjob __ref,int _width,int _height,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapresize", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapresize", new Object[] {_width,_height,_keepaspectratio}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Return LoadBitmapResize(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapResize(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height,_keepaspectratio);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapsample(b4a.example.httpjob __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapsample", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapsample", new Object[] {_width,_height}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub GetBitmapSample(Width As Int, Height As";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Return LoadBitmapSample(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapSample(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height);
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return null;
}
public String  _getstring(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2 /*String*/ (null,"UTF8");
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(b4a.example.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ).getObject()),_encoding);
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="End Sub";
return "";
}
public String  _head(b4a.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Try";
try {RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="req.InitializeHead(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("92228229",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="req.InitializeHead(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4a.example.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4a.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="Try";
try {RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("92162700",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="req.InitializePatch2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4a.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(b4a.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Try";
try {RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("91900549",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="req.InitializePost2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="End Sub";
return "";
}
public String  _postfile(b4a.example.httpjob __ref,String _link,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postfile", true))
	 {return ((String) Debug.delegate(ba, "postfile", new Object[] {_link,_dir,_filename}));}
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("92424840","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=2424854;
 //BA.debugLineNum = 2424854;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=2424855;
 //BA.debugLineNum = 2424855;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=2424858;
 //BA.debugLineNum = 2424858;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(b4a.example.httpjob __ref,String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postmultipart", true))
	 {return ((String) Debug.delegate(ba, "postmultipart", new Object[] {_link,_namevalues,_files}));}
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
byte[] _b = null;
String _eol = "";
boolean _empty = false;
String _key = "";
String _value = "";
String _s = "";
b4a.example.httpjob._multipartfiledata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4a.example.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
RDebugUtils.currentLine=2293789;
 //BA.debugLineNum = 2293789;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=2293790;
 //BA.debugLineNum = 2293790;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=2293791;
 //BA.debugLineNum = 2293791;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
RDebugUtils.currentLine=2293792;
 //BA.debugLineNum = 2293792;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=2293795;
 //BA.debugLineNum = 2293795;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=2293796;
 //BA.debugLineNum = 2293796;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=2293799;
 //BA.debugLineNum = 2293799;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=2293800;
 //BA.debugLineNum = 2293800;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=2293801;
 //BA.debugLineNum = 2293801;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=2293802;
 //BA.debugLineNum = 2293802;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=2293803;
 //BA.debugLineNum = 2293803;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentEncoding("UTF8");
RDebugUtils.currentLine=2293804;
 //BA.debugLineNum = 2293804;BA.debugLine="End Sub";
return "";
}
public String  _poststring(b4a.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4a.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Try";
try {RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("92031621",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="req.InitializePut2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4a.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
}