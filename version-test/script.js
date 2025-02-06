const axios = require('axios');

async function makeConcurrentRequests() {
  const url = 'http://localhost:8080/api/v1/version';
  const requestCount = 2; // Number of concurrent requests

  // Create an array of promises
  const requests = Array.from({ length: requestCount }, () => 
    axios.post(url).then(response => response.data).catch(error => console.error(error.message))
  );

  try {
    const results = await Promise.all(requests);
    console.log('All requests completed:', results);
  } catch (error) {
    console.error('Error during concurrent requests:', error);
  }
}

makeConcurrentRequests();

