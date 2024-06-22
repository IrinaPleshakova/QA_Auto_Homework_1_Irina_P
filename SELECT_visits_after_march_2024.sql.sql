SELECT 
    v.VisitDate AS "Дата визита",
    v.Reason AS "Причина визита",
    mr.Diagnosis AS "Диагноз",
    mr.Treatment AS "Лечение",
    c.Name AS "Имя кота",
    c.Breed AS "Порода кота",
    o.Name AS "Имя хозяина",
    o.Phone AS "Телефон хозяина"
FROM 
    Visits v
JOIN 
    MedicalRecords mr ON v.VisitID = mr.VisitID
JOIN 
    Cats c ON v.CatID = c.CatID
JOIN 
    Owners o ON c.OwnerID = o.OwnerID
WHERE 
    v.VisitDate > '2024-03-01';



/*Возможно не до конца правильно поняла задание (надо ли объединять имя и породу кота в один столбец 
и имя и телефон хозяина в другой, или оставить их отдельно и просто соблюдать последовательность, 
поэтому написала второй вариант запроса с объединением :)*/
SELECT
    v.VisitDate AS "Дата визита",
    v.Reason AS "Причина визита",
    mr.Diagnosis AS "Диагноз",
    mr.Treatment AS "Лечение",
    CONCAT(c.Name, ' (', c.Breed, ')') AS "Имя и порода кота",
    CONCAT(o.Name, ' - ', o.Phone) AS "Имя и телефон хозяина"
FROM 
    Visits v
JOIN 
    MedicalRecords mr ON v.VisitID = mr.VisitID
JOIN 
    Cats c ON v.CatID = c.CatID
JOIN 
    Owners o ON c.OwnerID = o.OwnerID
WHERE 
    v.VisitDate > '2024-03-01';