'use strict'
const merge = require('webpack-merge')
const devEnv = require('./dev.env')

module.exports = merge(devEnv, {
  NODE_ENV: '"testing"',

  //配置测试环境
	WEB_API: '"http://192.168.137.10:8603"',


})
