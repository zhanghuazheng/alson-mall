# 一、Vue组件执行流程

index.html-->main.js

```vue
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})

```

# 二、自定义的组件使用

## 1.写组件

```vue
<template>
  <div>
    hello,{{name}}
  </div>
</template>

<script>
  export default {
    data: {
      name: "张华政"
    },
    name: "Hello.vue"
  }
</script>

<style scoped>

</style>
```

## 2.写路由

![image-20200719175025301](E:\workspaces\mall-code\alson-mall\doc\vue前端开发笔记.assets\image-20200719175025301.png)



## 3.单元测试

![image-20200719175424251](E:\workspaces\mall-code\alson-mall\doc\vue前端开发笔记.assets\image-20200719175424251.png)

# 二、Vue整合element-ui

## 1.参考网址

https://element.eleme.cn/#/zh-CN/component/installation

## 2.安装

```shell
npm i element-ui -S
```



## 3.导入

在 main.js 中写入以下内容：

```js
import Vue from 'vue';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import App from './App.vue';

Vue.use(ElementUI);

new Vue({
  el: '#app',
  render: h => h(App)
});
```

