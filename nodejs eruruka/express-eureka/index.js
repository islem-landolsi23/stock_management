const express = require('express');
const Eureka = require('eureka-js-client').Eureka;
const bodyParser = require('body-parser');
const mongoose = require('mongoose');
const cors = require('cors');
const app = express();
app.use(cors());
app.use(bodyParser.json());
///////////////////////////mongoose ///////////////////////////

mongoose.connect('mongodb://localhost:27017/mydatabase', { useNewUrlParser: true, useUnifiedTopology: true })
  .then(() => {
    console.log('Connected to MongoDB');
  })
  .catch((error) => {
    console.error('Error connecting to MongoDB:', error);
  });




///////////////////// client eureka //////////////////////
const client = new Eureka({
    instance: {
      app: 'category',
      hostName: 'localhost',
      ipAddr: '127.0.0.1',
      port: {
        '$': 3000,
        '@enabled': true,
      },
      vipAddress: 'eureka',
      statusPageUrl: 'http://localhost:8080/info',
      dataCenterInfo: {
        '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
        name: 'MyOwn',
      },
    },
    eureka: {
      host: 'localhost',
      port: 8888,
      servicePath: '/eureka/apps/',
    },
  });
  app.listen(3000, () => {
    console.log('Express server started on port 3000');
    client.start(error => {
      console.log('Eureka client started');
    });
  });

  ////////////////////////  rest api 

// Routes
const categoryRouter = require('./routes/category');
app.use('/category', categoryRouter);




app.use(cors({
  origin: 'http://localhost:4200', // Replace with your Angular application's URL
  methods: ['GET', 'POST'], // Specify allowed methods
  allowedHeaders: ['Content-Type', 'Authorization'] // Specify allowed headers
}));



