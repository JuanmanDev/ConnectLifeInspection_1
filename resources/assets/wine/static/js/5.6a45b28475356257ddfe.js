webpackJsonp([5],{JiXH:function(t,i){},sNa7:function(t,i,n){"use strict";Object.defineProperty(i,"__esModule",{value:!0});var o=n("mvHQ"),e=n.n(o),s=n("bOdI"),a=n.n(s),l=(n("Fd2+"),a()({name:"lights",data:function(){var t;return t={show:!0,lan:"en",hasLanguage:!1,from:"html",deviceId:"",nativeKey:"lights",lightsInfo:"",lightsFunctionalOnoff:!0,conShow:!0,conShow_rgb:!1,brightVal:0,lightVal:0,showLighta:0,showLightb:0,step:1,minVal:0,maxVal:100,minLight:0,maxLight:23,brightActive:!1,lTActive:!1,showLoading:!1,FunctionalLightsIntensity:0,FunctionalLightsColour:0,FunctionalRGBlightIntensity:0,FunctionalGColour:"",FunctionalRColour:"",FunctionalBColour:"",FunctionalOntime:0,RGBLightOnoff:!1,showPop:!1,presenseSensorDisplayList:[this.$t("lang.after_one_minute"),this.$t("lang.after_five_minute"),this.$t("lang.after_fifteen_minute"),this.$t("lang.after_thirty_minute"),this.$t("lang.after_sixty_minute"),this.$t("lang.after_ninety_minute"),this.$t("lang.after_always")],onforPop:!1,RemoteControlModeFlag:1,oneZoneFlag:0,sabbathmode:0,sabbathModeStatus:0,onlineStatus:"1"},a()(t,"lightVal",null),a()(t,"gotoflag",0),a()(t,"FunctionalOntimeText",""),a()(t,"init_data",{}),a()(t,"dragFlag",!1),t},components:{loading:function(){return n.e(0).then(n.bind(null,"44dg"))}},created:function(){this.oneZoneFlag=this.$route.query.oneZoneFlag||1,this.nativeKey=this.$route.name||"lights",this.$i18n.locale=this.$commonMethods.getNativeLanguage(this.$route.query.language,this.hasLanguage,this.lan),this.from=this.$route.query.from||"html",this.deviceId=this.$route.query.deviceId||"",this.onlineStatus=this.$route.query.onlineStatus?this.$route.query.onlineStatus:"1",window.getLightsCallback=this.getLightsCallback,window.sendCmdCallback=this.sendCmdCallback,window.onBackPressedCallback=this.onBackPressedCallback,window.getDevicePropertiesInfoCallback=this.getDevicePropertiesInfoCallback},mounted:function(){null!=window.sessionStorage.getItem("lightVal")?(this.lightVal=JSON.parse(window.sessionStorage.getItem("lightVal")),null!=this.lightVal&&(this.FunctionalOntime=this.lightVal.FunctionalOntime,6==this.FunctionalOntime?this.FunctionalOntimeText=this.presenseSensorDisplayList[0]:this.FunctionalOntimeText=this.presenseSensorDisplayList[this.FunctionalOntime+1],this.FunctionalLightsIntensity=this.lightVal.FunctionalLightsIntensity,this.FunctionalLightsIntensity>0?this.lightsFunctionalOnoff=!0:this.lightsFunctionalOnoff=!1,this.FunctionalLightsColour=this.lightVal.FunctionalLightsColour,this.FunctionalRGBlightIntensity=this.lightVal.FunctionalRGBlightIntensity,this.FunctionalRGBlightIntensity>0?this.RGBLightOnoff=!0:this.RGBLightOnoff=!1,this.oneZoneFlag=this.lightVal.oneZoneFlag)):(this.getDevicePropertiesInfo(),this.showLoading=!0)},activated:function(){},watch:{},destroyed:function(){0==this.gotoflag&&window.sessionStorage.removeItem("lightVal")},beforeRouteLeave:function(t,i,n){console.log("to.name",t.name),console.log("from.name",i.name),"newLights"==t.name&&"functionalMode"==i.name?(i.meta.keepAlive=!1,this.gotoflag=0):(this.gotoflag=1,i.meta.keepAlive=!1,0==this.oneZoneFlag?this.lightVal={FunctionalLightsIntensity:this.FunctionalLightsIntensity,FunctionalLightsColour:this.FunctionalLightsColour,FunctionalRGBlightIntensity:this.FunctionalRGBlightIntensity,FunctionalOntime:this.FunctionalOntime,oneZoneFlag:this.oneZoneFlag}:this.lightVal={FunctionalLightsIntensity:this.FunctionalLightsIntensity,FunctionalLightsColour:this.FunctionalLightsColour,FunctionalOntime:this.FunctionalOntime,oneZoneFlag:this.oneZoneFlag},window.sessionStorage.setItem("lightVal",e()(this.lightVal))),n()},computed:{commonHeaderBg:function(){return{background:"#fff"}},sliderBg:function(){var t;return t={background:"rgb(123,123,123)"},a()(t,"background","-webkit-linear-gradient(left, rgb(123,123,123) 0% , rgb(187,187,187) 42%, rgb(228,228,228) 71%, rgb(255,255,255) 100%)"),a()(t,"background","-o-linear-gradient(to right, rgb(123,123,123) 0% , rgb(187,187,187) 42%, rgb(228,228,228) 71%, rgb(255,255,255) 100%)"),a()(t,"background","-moz-linear-gradient(to right, rgb(123,123,123) 0% , rgb(187,187,187) 42%, rgb(228,228,228) 71%, rgb(255,255,255) 100%)"),a()(t,"background","linear-gradient(to right, rgb(123,123,123) 0% , rgb(187,187,187) 42%, rgb(228,228,228) 71%, rgb(255,255,255) 100%)"),t},sliderBgSelect:function(){var t;return t={background:"rgb(0, 0, 0)"},a()(t,"background","-webkit-linear-gradient(left, rgb(0, 0, 0), rgb(233, 233, 233))"),a()(t,"background","-o-linear-gradient(to right, rgb(0, 0, 0), rgb(233, 233, 233))"),a()(t,"background","-moz-linear-gradient(to right, rgb(0, 0, 0), rgb(233, 233, 233))"),a()(t,"background","linear-gradient(to right, rgb(0, 0, 0), rgb(233, 233, 233))"),t},sliderBgs:function(){var t;return t={background:"rgb(229,229,229)"},a()(t,"background","-webkit-linear-gradient(left, rgb(253,195,0) 0% , rgb(229,229,229) 52%, rgb(0,182,237) 100%)"),a()(t,"background","-o-linear-gradient(right, rgb(253,195,0) 0% , rgb(229,229,229) 52%, rgb(0,182,237) 100%)"),a()(t,"background","-moz-linear-gradient(right, rgb(253,195,0) 0% , rgb(229,229,229) 52%, rgb(0,182,237) 100%)"),a()(t,"background","linear-gradient(to right, rgb(253,195,0) 0% , rgb(229,229,229) 52%, rgb(0,182,237) 100%)"),t},barHeight:function(){return"0.64rem"},_FunctionalColour:function(){return this.$store.state.lights.FunctionalColour}},methods:{getDevicePropertiesInfo:function(){var t={deviceId:this.deviceId};if(this.$native.getDevicePropertiesInfo(this.from,this.nativeKey,e()(t)),"html"==this.from){this.getDevicePropertiesInfoCallback({resultCode:0,data:{deviceNickName:"wineCooller1wineCooller2",deviceProps:{RemoteControlMode:"1",SabbathMode:"1",SabbathModeStatus:"2"}},errorInfo:""})}},getDevicePropertiesInfoCallback:function(t){if(console.log("获取设备属性列表回调的callBack",t),this.proList=t,"0"==this.proList.resultCode||0==this.proList.resultCode){if("data"in this.proList&&"deviceProps"in this.proList.data){var i=this.proList.data,n=i.deviceProps;i.deviceNickName;this.sabbathmode=Number(n.SabbathMode),this.sabbathModeStatus=Number(n.SabbathModeStatus),this.getLightsInfo()}}else this.$toast(this.$t("lang.failure")),this.showLoading=!1},toToast:function(){"2"==this.onlineStatus?this.$toast(this.$t("lang.appliance_offline")):0==this.RemoteControlModeFlag?this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_on_the_remote")+"</span></div>",type:"html"}):1==this.sabbathmode&&2==this.sabbathModeStatus?this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_off_the_sabbath")+"</span></div>",type:"html"}):console.log("不提示")},showPopSave:function(){this.showPop=!1},goFunctionalOntime:function(){this.$router.push({path:"/newLights/functionalMode",query:{from:this.from,language:this.$i18n.locale,deviceId:this.deviceId,fromPageName:"functionalMode"}})},goAmbientMode:function(){this.$router.push({path:"/newLights/ambientMode",query:{from:this.from,language:this.$i18n.locale,deviceId:this.deviceId,fromPageName:"ambientMode"}})},goModesUsage:function(){this.$router.push({path:"/newLights/modesUsage",query:{from:this.from,language:this.$i18n.locale,deviceId:this.deviceId,fromPageName:"modesUsage"}})},onConfirm:function(t,i){this.FunctionalOntimeText=t,this.FunctionalOntime=0==i?i+6:i-1,console.log("FunctionalOntime的值",this.FunctionalOntime),this.showPop=!1,this.onforPop=!1},onCancel:function(){this.showPop=!1,this.onforPop=!1},togglePop:function(){"2"==this.onlineStatus?this.$toast(this.$t("lang.appliance_offline")):0==this.RemoteControlModeFlag?this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_on_the_remote")+"</span></div>",type:"html"}):1==this.sabbathmode&&2==this.sabbathModeStatus?this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_off_the_sabbath")+"</span></div>",type:"html"}):(console.log("可以控制"),this.showPop=!0,this.onforPop=!0)},handleColor_rgb:function(t){},goBack:function(){var t={language:this.$i18n.locale,from:this.from,deviceId:this.deviceId};this.$commonMethods.routerGo(this.$router,"/newLights/newLights",t)},shelfLightsSwitch:function(t){},handleShelfLightsBrightness:function(t){"2"==this.onlineStatus||0==this.RemoteControlModeFlag||1==this.sabbathmode&&2==this.sabbathModeStatus?("2"==this.onlineStatus?this.$toast(this.$t("lang.appliance_offline")):0==this.RemoteControlModeFlag?this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_on_the_remote")+"</span></div>",type:"html"}):1==this.sabbathmode&&2==this.sabbathModeStatus&&this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_off_the_sabbath")+"</span></div>",type:"html"}),this.FunctionalLightsIntensity=Number(this.init_data.FunctionalLightsIntensity),this.getLightsInfo()):(this.dragFlag||this.$fireBase.gaWebReport(this.from,"click","functional_mode_shelf_lights_brightness",{FunctionalLightsIntensity:t}),this.FunctionalLightsIntensity=t)},handleShelfLightsBrightnessDrag:function(){this.$fireBase.gaWebReport(this.from,"move","functional_mode_shelf_lights_brightness",{FunctionalLightsIntensity:this.FunctionalLightsIntensity}),this.dragFlag=!1},handleLightsTemperature:function(t){"2"==this.onlineStatus||0==this.RemoteControlModeFlag||1==this.sabbathmode&&2==this.sabbathModeStatus?("2"==this.onlineStatus?this.$toast(this.$t("lang.appliance_offline")):0==this.RemoteControlModeFlag?this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_on_the_remote")+"</span></div>",type:"html"}):1==this.sabbathmode&&2==this.sabbathModeStatus&&this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_off_the_sabbath")+"</span></div>",type:"html"}),this.FunctionalLightsColour=Number(this.init_data.FunctionalLightsColour),this.getLightsInfo()):(this.dragFlag||this.$fireBase.gaWebReport(this.from,"click","functional_mode_shelf_lights_light_temperature",{FunctionalLightsColour:t}),this.FunctionalLightsColour=t)},handleLightsTemperatureDrag:function(){this.$fireBase.gaWebReport(this.from,"move","functional_mode_shelf_lights_light_temperature",{FunctionalLightsColour:this.FunctionalLightsColour}),this.dragFlag=!1},RGBlightsSwitch:function(t){},handleRGBLightBrightness:function(t){"2"==this.onlineStatus||0==this.RemoteControlModeFlag||1==this.sabbathmode&&2==this.sabbathModeStatus?("2"==this.onlineStatus?this.$toast(this.$t("lang.appliance_offline")):0==this.RemoteControlModeFlag?this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_on_the_remote")+"</span></div>",type:"html"}):1==this.sabbathmode&&2==this.sabbathModeStatus&&this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_off_the_sabbath")+"</span></div>",type:"html"}),this.FunctionalRGBlightIntensity=Number(this.init_data.FunctionalRGBlightIntensity),this.getLightsInfo()):(this.dragFlag||this.$fireBase.gaWebReport(this.from,"click","functional_mode_rgb_lights_light_temperature",{FunctionalRGBlightIntensity:t}),this.FunctionalRGBlightIntensity=t)},handleRGBLightBrightnessDrag:function(){this.$fireBase.gaWebReport(this.from,"move","functional_mode_shelf_lights_light_temperature",{FunctionalRGBlightIntensity:this.FunctionalRGBlightIntensity}),this.dragFlag=!1},selectColor:function(){if("2"==this.onlineStatus)this.$toast(this.$t("lang.appliance_offline"));else if(0==this.RemoteControlModeFlag)this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_on_the_remote")+"</span></div>",type:"html"});else if(1==this.sabbathmode&&2==this.sabbathModeStatus)this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_off_the_sabbath")+"</span></div>",type:"html"});else{var t={language:this.$i18n.locale,from:this.from,deviceId:this.deviceId,fromPageName:"functionalMode"};this.$commonMethods.routerGo(this.$router,"/newLights/colorSelect",t)}},getLightsInfo:function(){var t={deviceId:this.deviceId};if(this.$native.getLightsInfo(this.from,this.nativeKey,e()(t)),"html"==this.from){this.getLightsCallback({errorDesc:"获灯光信息成功",resultCode:"0",data:{FunctionalLightsIntensity:"20",FunctionalLightsColour:"20",FunctionalRGBlightIntensity:"10",FunctionalRcolour:"125",FunctionalGcolour:"125",FunctionalBcolour:"125",FunctionalOntime:"6",RemoteControlMode:"1"}})}},getLightsCallback:function(t){if(console.log("Functional页面 getLightsCallback返回的数据",t),"0"==t.resultCode||0==t.resultCode){if("data"in t){var i=t.data;if("{}"==e()(this.init_data)){this.FunctionalOntime=Number(i.FunctionalOntime)||0,6==this.FunctionalOntime?this.FunctionalOntimeText=this.presenseSensorDisplayList[0]:this.FunctionalOntimeText=this.presenseSensorDisplayList[this.FunctionalOntime+1],this.FunctionalLightsIntensity=Number(i.FunctionalLightsIntensity)||0,this.FunctionalLightsIntensity>0?this.lightsFunctionalOnoff=!0:this.lightsFunctionalOnoff=!1,0==this.oneZoneFlag?this.FunctionalLightsColour=23-Number(i.FunctionalLightsColour)||0:this.FunctionalLightsColour=Number(i.FunctionalLightsColour)||0,this.FunctionalRGBlightIntensity=Number(i.FunctionalRGBlightIntensity)||0,this.FunctionalRGBlightIntensity>0?this.RGBLightOnoff=!0:this.RGBLightOnoff=!1,this.FunctionalRColour=Number(i.FunctionalRcolour)||0,this.FunctionalGColour=Number(i.FunctionalGcolour)||0,this.FunctionalBColour=Number(i.FunctionalBcolour)||0;var n="rgb("+this.FunctionalRColour+","+this.FunctionalGColour+","+this.FunctionalBColour+")";console.log("功能灯RGB灯颜色",n),console.log("FunctionalRColour{}",this.FunctionalRColour),console.log("FunctionalGColour{}",this.FunctionalGColour),console.log("FunctionalBColour{}",this.FunctionalBColour),this.$store.commit("lights/FUNCTIONAL_R_COLOUR",this.FunctionalRColour),this.$store.commit("lights/FUNCTIONAL_G_COLOUR",this.FunctionalGColour),this.$store.commit("lights/FUNCTIONAL_B_COLOUR",this.FunctionalBColour),this.$store.commit("lights/FUNCTIONAL_COLOUR",n),this.RemoteControlModeFlag=Number(i.RemoteControlMode),console.log("lightsInfo.RemoteControlMode",i.RemoteControlMode),console.log("_FunctionalColour{}里的功能灯RGB数据",this._FunctionalColour),this.init_data=i}this.init_data.FunctionalOntime!=Number(i.FunctionalOntime)&&(this.init_data.FunctionalOntime=Number(i.FunctionalOntime),this.FunctionalOntime=Number(i.FunctionalOntime)||0,6==this.FunctionalOntime?this.FunctionalOntimeText=this.presenseSensorDisplayList[0]:this.FunctionalOntimeText=this.presenseSensorDisplayList[this.FunctionalOntime+1]),this.init_data.FunctionalLightsIntensity!=Number(i.FunctionalLightsIntensity)&&(this.init_data.FunctionalLightsIntensity=Number(i.FunctionalLightsIntensity),this.FunctionalLightsIntensity=Number(i.FunctionalLightsIntensity)||0,this.FunctionalLightsIntensity>0?this.lightsFunctionalOnoff=!0:this.lightsFunctionalOnoff=!1),this.init_data.FunctionalLightsColour!=Number(i.FunctionalLightsColour)&&(this.init_data.FunctionalLightsColour=Number(i.FunctionalLightsColour),0==this.oneZoneFlag?this.FunctionalLightsColour=23-Number(i.FunctionalLightsColour)||0:this.FunctionalLightsColour=Number(i.FunctionalLightsColour)||0),this.init_data.FunctionalRGBlightIntensity!=Number(i.FunctionalRGBlightIntensity)&&(this.init_data.FunctionalRGBlightIntensity=Number(i.FunctionalRGBlightIntensity),this.FunctionalRGBlightIntensity=Number(i.FunctionalRGBlightIntensity)||0,this.FunctionalRGBlightIntensity>0?this.RGBLightOnoff=!0:this.RGBLightOnoff=!1),this.init_data.FunctionalRcolour!=Number(i.FunctionalRcolour)&&(this.init_data.FunctionalRcolour=Number(i.FunctionalRcolour),this.FunctionalRColour=Number(i.FunctionalRcolour)||0,this.$store.commit("lights/FUNCTIONAL_R_COLOUR",this.FunctionalRColour)),this.init_data.FunctionalGcolour!=Number(i.FunctionalGcolour)&&(this.init_data.FunctionalGcolour=Number(i.FunctionalGcolour),this.FunctionalGColour=Number(i.FunctionalGcolour)||0,this.$store.commit("lights/FUNCTIONAL_G_COLOUR",this.FunctionalGColour)),this.init_data.FunctionalBcolour!=Number(i.FunctionalBcolour)&&(this.init_data.FunctionalBcolour=Number(i.FunctionalBcolour),this.FunctionalBColour=Number(i.FunctionalBcolour)||0,this.$store.commit("lights/FUNCTIONAL_B_COLOUR",this.FunctionalBColour)),this.init_data.RemoteControlModeFlag!=Number(i.RemoteControlMode)&&(this.init_data.RemoteControlModeFlag=Number(i.RemoteControlMode),this.RemoteControlModeFlag=Number(i.RemoteControlMode)),console.log("FunctionalRColour",this.FunctionalRColour),console.log("FunctionalGColour",this.FunctionalGColour),console.log("FunctionalBColour",this.FunctionalBColour);var o="rgb("+this.FunctionalRColour+","+this.FunctionalGColour+","+this.FunctionalBColour+")";this.$store.commit("lights/FUNCTIONAL_COLOUR",o),console.log("_FunctionalColour里的功能灯RGB数据",this._FunctionalColour)}}else this.$toast(this.$t("lang.failure"));this.showLoading=!1},saveHandle:function(){if(console.log("RemoteControlModeFlag==========",this.RemoteControlModeFlag),"2"==this.onlineStatus)this.$toast(this.$t("lang.appliance_offline"));else if(0==this.RemoteControlModeFlag)console.log("RemoteControlModeFlag等于0时走这里"),this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_on_the_remote")+"</span></div>",type:"html"});else if(1==this.sabbathmode&&2==this.sabbathModeStatus)this.$toast({message:'<div style="word-break:keep-all;word-wrap:break-word;overflow:hidden;"><span>'+this.$t("lang.turn_off_the_sabbath")+"</span></div>",type:"html"});else{console.log("点击保存");var t={};if(t=0==this.oneZoneFlag?{FunctionalLightsIntensity:this.FunctionalLightsIntensity.toString(),FunctionalLightsColour:(23-Number(this.FunctionalLightsColour)).toString(),FunctionalRGBlightIntensity:this.FunctionalRGBlightIntensity.toString(),FunctionalOntime:this.FunctionalOntime.toString()}:{FunctionalLightsIntensity:this.FunctionalLightsIntensity.toString(),FunctionalLightsColour:Number(this.FunctionalLightsColour).toString(),FunctionalOntime:this.FunctionalOntime.toString()},this.$fireBase.gaWebReport(this.from,"save_btn","functional_mode_save",t),console.log("点击保存的入参params",e()(t)),this.$native.sendCmd(this.from,this.nativeKey,this.deviceId,e()(t)),"html"==this.from){this.sendCmdCallback({resultCode:"0"})}}},sendCmdCallback:function(t){if(this.showLoading=!1,console.log("sendCmdCallback返回数据_functional页面",t),"0"==t.resultCode||0==t.resultCode){this.$toast(this.$t("lang.success"));var i={language:this.$i18n.locale,from:this.from,deviceId:this.deviceId};this.$commonMethods.routerGo(this.$router,"/newLights/newLights",i)}else this.showLoading=!1,this.$toast(this.$t("lang.failure"))},onBackPressedCallback:function(){this.goBack()}}},"components",{commonHeader:function(){return new Promise(function(t){t()}).then(n.bind(null,"G/qF"))},commonBottom:function(){return n.e(1).then(n.bind(null,"jxgB"))},loading:function(){return n.e(0).then(n.bind(null,"44dg"))}})),h={render:function(){var t=this,i=t.$createElement,n=t._self._c||i;return n("div",{attrs:{id:"wine_lights"}},[n("common-header",{attrs:{bg:t.commonHeaderBg}},[n("div",{staticClass:"common_header_left",attrs:{slot:"left"},on:{click:t.goBack},slot:"left"},[n("i",{staticClass:"icon iconfont"},[t._v("")])]),t._v(" "),n("div",{staticClass:"common_header_center oh-1",attrs:{slot:"center"},slot:"center"},[t._v(t._s(t.$t("lang.function_mode")))])]),t._v(" "),n("div",{staticClass:"lights_tab_card_content"},[n("div",[n("div",{staticClass:"lights_content"},[n("div",{staticClass:"lights_switch clearfix"},[n("p",{staticClass:"lights_switch_title oh-1"},[t._v(t._s(t.$t("lang.shelf_lights")))]),t._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:!1,expression:"false"}],staticClass:"lights_switch_btn"},[n("van-switch",{attrs:{"active-color":"#000","inactive-color":"#fff",disabled:0==t.RemoteControlModeFlag||1==t.sabbathmode||"2"==t.onlineStatus},on:{change:t.shelfLightsSwitch,click:t.toToast},model:{value:t.lightsFunctionalOnoff,callback:function(i){t.lightsFunctionalOnoff=i},expression:"lightsFunctionalOnoff"}})],1)]),t._v(" "),n("div",{staticClass:"lights_item"},[n("div",{staticStyle:{display:"flex"}},[n("p",{staticClass:"lights_title"},[t._v(t._s(t.$t("lang.brightness")))]),t._v(" "),t.FunctionalLightsIntensity>0?n("p",{staticClass:"lights_bright_percent",style:{color:t.conShow?"#000":"#c4c4c4"}},[t._v(t._s(t.FunctionalLightsIntensity)+"%")]):n("p",{staticClass:"lights_bright_percent",style:{color:t.conShow?"#000":"#c4c4c4"}},[t._v(t._s(t.$t("lang.off")))])]),t._v(" "),t.conShow?n("div",{staticClass:"lights_slider_wrap",style:t.brightActive?t.sliderBgSelect:t.sliderBg},[n("van-slider",{attrs:{"bar-height":t.barHeight,"inactive-color":"none","active-color":"none",step:t.step,min:t.minVal,max:t.maxVal},on:{"drag-start":function(i){t.dragFlag=!0},"drag-end":t.handleShelfLightsBrightnessDrag,change:t.handleShelfLightsBrightness},model:{value:t.FunctionalLightsIntensity,callback:function(i){t.FunctionalLightsIntensity=i},expression:"FunctionalLightsIntensity"}},[n("div",{staticClass:"lights_button",style:{background:t.brightActive?"#fff":"#000"},attrs:{slot:"button"},slot:"button"})])],1):t._e(),t._v(" "),t.conShow?t._e():n("div",{staticClass:"lights_disable_block"}),t._v(" "),n("p",{staticClass:"lights_bright_percent_show",staticStyle:{color:"#000"}},[n("span",[t._v(t._s(t.$t("lang.off")))]),t._v(" "),n("span",[t._v("100%")])])]),t._v(" "),n("div",{staticClass:"lights_item"},[n("p",{staticClass:"lights_title"},[t._v(t._s(t.$t("lang.light_temperature")))]),t._v(" "),n("div",{staticClass:"lights_slider_wrap",style:t.sliderBgs},[n("van-slider",{attrs:{"bar-height":t.barHeight,"inactive-color":"none","active-color":"none",step:t.step,min:t.minLight,max:t.maxLight},on:{"drag-start":function(i){t.dragFlag=!0},"drag-end":t.handleLightsTemperatureDrag,change:t.handleLightsTemperature},model:{value:t.FunctionalLightsColour,callback:function(i){t.FunctionalLightsColour=i},expression:"FunctionalLightsColour"}},[n("div",{staticClass:"lights_button",style:{background:t.lTActive?"#fff":"#000"},attrs:{slot:"button"},slot:"button"})])],1),t._v(" "),n("p",{staticClass:"lights_bright_percent_show",staticStyle:{color:"#000"}},[n("span",[t._v(t._s(t.$t("lang.warm")))]),t._v(" "),n("span",[t._v(t._s(t.$t("lang.cold")))])])]),t._v(" "),n("br"),t._v(" "),0==t.oneZoneFlag?[n("div",{staticClass:"line"}),t._v(" "),n("div",{staticClass:"lights_content"},[n("div",{staticClass:"lights_switch clearfix"},[n("p",{staticClass:"lights_switch_title oh-1"},[t._v(t._s(t.$t("lang.rgb_light")))]),t._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:!1,expression:"false"}],staticClass:"lights_switch_btn"},[n("van-switch",{attrs:{"active-color":"#000","inactive-color":"#fff",disabled:0==t.RemoteControlModeFlag||1==t.sabbathmode||"2"==t.onlineStatus},on:{change:t.RGBlightsSwitch,click:t.toToast},model:{value:t.RGBLightOnoff,callback:function(i){t.RGBLightOnoff=i},expression:"RGBLightOnoff"}})],1)]),t._v(" "),n("div",{staticClass:"lights_item"},[n("div",{staticStyle:{display:"flex"}},[n("p",{staticClass:"lights_title"},[t._v(t._s(t.$t("lang.brightness")))]),t._v(" "),t.FunctionalRGBlightIntensity>0?n("p",{staticClass:"lights_bright_percent"},[t._v(t._s(t.FunctionalRGBlightIntensity)+"%")]):n("p",{staticClass:"lights_bright_percent"},[t._v(t._s(t.$t("lang.off")))])]),t._v(" "),n("div",{staticClass:"lights_slider_wrap",style:t.brightActive?t.sliderBgSelect:t.sliderBg},[n("van-slider",{attrs:{"bar-height":t.barHeight,"inactive-color":"none","active-color":"none",step:t.step,min:t.minVal,max:t.maxVal},on:{"drag-start":function(i){t.dragFlag=!0},"drag-end":t.handleRGBLightBrightnessDrag,change:t.handleRGBLightBrightness},model:{value:t.FunctionalRGBlightIntensity,callback:function(i){t.FunctionalRGBlightIntensity=i},expression:"FunctionalRGBlightIntensity"}},[n("div",{staticClass:"lights_button",style:{background:t.brightActive?"#fff":"#000"},attrs:{slot:"button"},slot:"button"})])],1),t._v(" "),n("p",{staticClass:"lights_bright_percent_show",staticStyle:{color:"#000"}},[n("span",[t._v(t._s(t.$t("lang.off")))]),t._v(" "),n("span",[t._v("100%")])])])]),t._v(" "),n("div",{staticClass:"lights_item"},[n("p",{staticClass:"lights_title"},[t._v(t._s(t.$t("lang.rgb_lights_colour")))]),t._v(" "),n("div",{staticClass:"ambient_color",style:{background:t._FunctionalColour},on:{click:t.selectColor}})])]:t._e(),t._v(" "),n("div",{staticClass:"line"}),t._v(" "),n("div",{staticClass:"lights_item onTime",on:{click:t.togglePop}},[n("p",{staticClass:"lights_title"},[t._v(t._s(t.$t("lang.on_for")))]),t._v(" "),n("span",[t._v(t._s(t.FunctionalOntimeText))])]),t._v(" "),n("van-popup",{style:{height:100},attrs:{position:"bottom"},on:{"click-overlay":t.showPopSave},model:{value:t.onforPop,callback:function(i){t.onforPop=i},expression:"onforPop"}},[n("van-picker",{attrs:{columns:t.presenseSensorDisplayList,"confirm-button-text":t.$t("lang.confirm"),"cancel-button-text":t.$t("lang.cancel"),"show-toolbar":""},on:{cancel:t.onCancel,confirm:t.onConfirm}})],1)],2)])]),t._v(" "),t.showPop?t._e():n("common-bottom",{attrs:{text:t.$t("lang.save")},on:{btnHandle:t.saveHandle}}),t._v(" "),n("loading",{attrs:{"show-loading":t.showLoading}})],1)},staticRenderFns:[]};var r=n("VU/8")(l,h,!1,function(t){n("JiXH")},"data-v-dc6bdd1e",null);i.default=r.exports}});
//# sourceMappingURL=5.6a45b28475356257ddfe.js.map