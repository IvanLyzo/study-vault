import { useState, useEffect } from 'react';

const Fetch = () =>
{
    const [pages, setPages] = useState([]);
    useEffect(() =>
    {
        fetch('http://localhost:8080/api/pages')
            .then((res) =>
            {
                return res.json();
            })
            .then((data) =>
            {
                console.log(data);
                setPages(data);
            });
    }, []);
    return (
        <div>


            {pages.map((page) => (
                <p key={page.id}>{page.title}</p>
                // <img key={photo.id} src={photo.url} alt={photo.title} width={100} />
            ))}
        </div>
    );
};

export default Fetch;