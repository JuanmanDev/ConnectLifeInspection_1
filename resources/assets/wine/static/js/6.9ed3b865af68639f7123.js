webpackJsonp([6],{"+1LQ":function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n={name:"controls",props:["min","max","value","unit","minTemperature","maxTemperature","alert"],data:function(){return{slider:null,thunk:null,mouseDownWidth:"",mouseDowndisX:"",per:this.value,marginleftval:"-10px"}},mounted:function(){this.per>99?this.marginleftval="-20px":this.marginleftval="-10px",this.slider=this.$refs.slider,this.thunk=this.$refs.trunk},computed:{scale:function(){return(this.per-this.min)/(this.max-this.min)},showValue:function(){return parseInt(this.minTemperature)+this.scale*(parseInt(this.maxTemperature)-parseInt(this.minTemperature))},width:function(){return this.slider?this.slider.offsetWidth*this.scale+"px":"0px"},left:function(){return this.slider?this.slider.offsetWidth*this.scale-this.thunk.offsetWidth/2+"px":"0px"}},watch:{showValue:function(t,e){},minTemperature:function(t,e){this.per=(this.value-parseInt(this.minTemperature))/(parseInt(this.maxTemperature)-parseInt(this.minTemperature))*100,this.per>100&&(this.per=100)},maxTemperature:function(t,e){this.per=(this.value-parseInt(this.minTemperature))/(parseInt(this.maxTemperature)-parseInt(this.minTemperature))*100,this.per>100&&(this.per=100)},value:function(t,e){Math.round(this.showValue)!=t&&(this.per=(this.value-parseInt(this.minTemperature))/(parseInt(this.maxTemperature)-parseInt(this.minTemperature))*100,this.per>100&&(this.per=100))},alert:function(t,e){}},methods:{mouseDownHandler:function(t){var e=parseInt(this.width),s=t.targetTouches[0].clientX;this.mouseDownWidth=e,this.mouseDowndisX=s},mouseMoveHandler:function(t){},mouseUpHandler:function(){}}},r={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{attrs:{id:"hum_controls"}},[s("div",{ref:"slider",staticClass:"slider"},[s("div",{staticClass:"process",style:{width:t.width}}),t._v(" "),s("div",{ref:"trunk",staticClass:"thunk",style:{left:t.left},on:{touchstart:function(e){return e.preventDefault(),t.mouseDownHandler.apply(null,arguments)},touchmove:function(e){return e.preventDefault(),t.mouseMoveHandler.apply(null,arguments)},touchend:function(e){return e.preventDefault(),t.mouseUpHandler.apply(null,arguments)}}},[s("div",{staticClass:"block"})])])])},staticRenderFns:[]};var i=s("VU/8")(n,r,!1,function(t){s("n/2J")},null,null);e.default=i.exports},"n/2J":function(t,e){}});
//# sourceMappingURL=6.9ed3b865af68639f7123.js.map