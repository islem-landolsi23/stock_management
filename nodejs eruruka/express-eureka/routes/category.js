const express = require('express');
const router = express.Router();
const Category = require('../models/category');



// Create a new item
router.post('/add', (req, res) => {
    console.log("hello ",req.body);
    const category = new Category (req.body);
  
    category.save()
      .then(() => {
        res.status(201).send('category created');
      })
      .catch((error) => {
        console.error('Error creating category:', error);
        res.status(500).send('An error occurred');
      });
  });
  
  // Get all items
  router.get('/getAll', (req, res) => {
    Category .find()
      .then((category) => {
        res.send(category);
      })
      .catch((error) => {
        console.error('Error retrieving category:', error);
        res.status(500).send('An error occurred');
      });
  });
  router.delete('/All', (req, res) => {
    Category.deleteMany({})
      .then((category) => {
        res.send("deleted");
      })
      .catch((error) => {
        console.error('Error retrieving category:', error);
        res.status(500).send('An error occurred');
      });
  });
  
  module.exports = router;