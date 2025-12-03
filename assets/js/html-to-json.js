const fs = require('fs');
const path = require('path');
const cheerio = require('cheerio');

const htmlDir = './_site'; // adjust as needed
const outputDir = './converted-json';
if (!fs.existsSync(outputDir)) fs.mkdirSync(outputDir);

fs.readdirSync(htmlDir).forEach(file => {
  if (file.endsWith('.html')) {
    const filePath = path.join(htmlDir, file);
    const html = fs.readFileSync(filePath, 'utf8');
    const $ = cheerio.load(html);

    const title = $('title').text() || $('h1').first().text();
    const summary = $('meta[name="description"]').attr('content') || $('h2').first().text();
    const content = $('body').text().replace(/\s+/g, ' ').trim();

    const json = {
      id: file,
      title,
      summary,
      content
    };

    fs.writeFileSync(
      path.join(outputDir, file.replace('.html', '.json')),
      JSON.stringify(json, null, 2)
    );
  }
});